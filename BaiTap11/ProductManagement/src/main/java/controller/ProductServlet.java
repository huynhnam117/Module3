package controller;


import model.Product;
import service.ProductService;
import service.impl.IProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;


@WebServlet(name = "ProductServlet", value = "/Product")
public class ProductServlet extends HttpServlet {
    private IProductService productService = new ProductService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String action = request.getParameter("action");
         if(action == null){
             action = "";
         }
        switch (action){
            case "add":
                showFormCreate(request,response);
                break;
            case "delete":
                showDeleteForm(request, response);
                break;
            default:
                showListProduct(request,response);
                break;

        }
    }

    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) {
            int id = Integer.parseInt(request.getParameter("id"));
            Product product = this.productService.findById(id);
            RequestDispatcher dispatcher;
            if (product == null) {
                dispatcher = request.getRequestDispatcher("error-404.jsp");
            } else {
                request.setAttribute("product", product);
                dispatcher = request.getRequestDispatcher("/view/delete.jsp");
            }
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }

    private void showListProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> productList = productService.finAll();
        request.setAttribute("productList", productList);
        try {
        request.getRequestDispatcher("/view/list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("/view/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action) {
            case "add":
                save(request,response);
                break;
            case "delete":
                delete(request, response);
                break;
            case "edit":
                update(request, response);
                break;
            default:
        }
    }

    private void update(HttpServletRequest request, HttpServletResponse response) {
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            Double price = Double.parseDouble(request.getParameter("price"));
            String describe = request.getParameter("describe");
            String producer = request.getParameter("producer");
            Product product = this.productService.findById(id);
            RequestDispatcher dispatcher;
            if (product == null) {
                dispatcher = request.getRequestDispatcher("error-404.jsp");
            } else {
                product.setName(name);
                product.setPrice(price);
                product.setDescribe(describe);
                this.productService.update(id, product);
                request.setAttribute("product", product);
                request.setAttribute("mess", "Product information was updated");
                dispatcher = request.getRequestDispatcher("view/edit.jsp");
            }
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




    private void delete(HttpServletRequest request, HttpServletResponse response) {
            int id = Integer.parseInt(request.getParameter("id"));
            Product product = this.productService.findById(id);
            RequestDispatcher dispatcher;
            if (product == null) {
                dispatcher = request.getRequestDispatcher("error-404.jsp");
            } else {
                this.productService.delete(id);
                try {
                    response.sendRedirect("/customers");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    private void save(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        Double price = Double.parseDouble(request.getParameter("price"));
        String describe = request.getParameter("describe");
        String producer = request.getParameter("producer");
        Product product = new Product(id, name, price, describe, producer);
        productService.add(product);
        request.setAttribute("mess","Thêm thành công");
        try {
            request.getRequestDispatcher("/view/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
