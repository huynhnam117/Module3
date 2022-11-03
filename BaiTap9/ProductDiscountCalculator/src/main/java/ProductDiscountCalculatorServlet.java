import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Product_Discount_Calculator_Servlet", value = "/resul")
public class ProductDiscountCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String ProductDescription = request.getParameter("ProductDescription2");
        Double ListPrice = Double.parseDouble((request.getParameter("ListPrice")));
        Double DiscountPercent = Double.parseDouble((request.getParameter("DiscountPercent")));
        Double DiscountAmount = ListPrice * DiscountPercent * 0.01;
        Double DiscountPrice = ListPrice - DiscountAmount;

        request.setAttribute("ProductDescription", ProductDescription);
        request.setAttribute("ListPrice", ListPrice);
        request.setAttribute("DiscountPercent", DiscountPercent);
        request.setAttribute("DiscountAmount", DiscountAmount);
        request.setAttribute("DiscountPrice", DiscountPrice);
        request.getRequestDispatcher("/resul.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

    }
}
