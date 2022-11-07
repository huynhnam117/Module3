package controller;

import model.User;
import service.UserService;
import service.impl.IUserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "UserServlet", value = "/users")
public class UserServlet extends HttpServlet {
    private IUserService userService = new UserService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        try {
            switch (action) {
                case "create":
                    showNewForm(request, response);
                    break;
                case "edit":
                    showEditForm(request, response);
                    break;
                case "delete":
                    deleteUser(request, response);
                    break;
                case "sort":
                    sort(request, response);
                default:
                    listUser(request, response);

            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }


        private void deleteUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
            int id = Integer.parseInt(request.getParameter("id"));
            userService.deleteUserPro(id);

            List<User> listUser = userService.selectAllUsers();
            request.setAttribute("listUser", listUser);
            RequestDispatcher dispatcher = request.getRequestDispatcher("users/list.jsp");
            dispatcher.forward(request, response);
        }


    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
            RequestDispatcher dispatcher = request.getRequestDispatcher("users/create.jsp");
            dispatcher.forward(request, response);
        }
    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        User existingUser = userService.getUserById(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("users/edit.jsp");
        request.setAttribute("user", existingUser);
        dispatcher.forward(request, response);

    }

    private void sort(HttpServletRequest request, HttpServletResponse response) {
        String sortOption = request.getParameter("sortOption");
        try {
            List<User> sortedUsers = userService.sort(sortOption);

            request.setAttribute("listUser", sortedUsers);
            request.setAttribute("messSort", "Sorted!");

            request.getRequestDispatcher("users/list.jsp").forward(request, response);
        } catch (ServletException | IOException throwAbles) {
            throwAbles.printStackTrace();
        }
    }
    private void listUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        List<User> userList = userService.selectAllUsers();
        request.setAttribute("userList", userList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/list.jsp");
        dispatcher.forward(request, response);
    }

    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    insertUser(request, response);
                    break;
                case "edit":
                    updateUser(request, response);
                    break;
                case "search":
                    searchUser(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }


        private void searchUser(HttpServletRequest request, HttpServletResponse response) {
            String countrySearch = request.getParameter("searchCountry");
            try {
                List<User> usersFounded = userService.searchUser(countrySearch);
                List<User> users = userService.selectAllUsers();

                request.setAttribute("listUser", usersFounded);

                request.getRequestDispatcher("/users/list.jsp").forward(request, response);

            } catch (ServletException | IOException throwAbles) {
                throwAbles.printStackTrace();
            }
        }



    private void updateUser(HttpServletRequest request, HttpServletResponse response) 
         throws SQLException, IOException, ServletException {
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String country = request.getParameter("country");

            User book = new User(id, name, email, country);
            userService.updateUserPro(book);
            RequestDispatcher dispatcher = request.getRequestDispatcher("users/edit.jsp");
            dispatcher.forward(request, response);
        }
    

    private void insertUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String country = request.getParameter("country");
            User newUser = new User(name, email, country);
            userService.insertUserStore(newUser);
            RequestDispatcher dispatcher = request.getRequestDispatcher("users/create.jsp");
            dispatcher.forward(request, response);
        }

    }




