import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/sprawdzanieTekstu")
public class SprawdzanieTekstuServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String tekst = request.getParameter("tekst");

response.getWriter().println(tekst);
Metody m = new Metody();

        response.getWriter().println("Ilosc slow: "+ m.liczenieSlow(tekst));
        response.getWriter().println("Ilosc znakow: "+ m.liczenieWszystkichZnakow(tekst));
        response.getWriter().println("Ilosc znaków bez spacji: "+ m.liczenieZNakowBezSPacji(tekst));
        boolean a = m.czyTekstJestPolidromem(tekst);
        response.getWriter().print("Polidrom: " );
        response.getWriter().print(m.czyTekstJestPolidromem(tekst));

        System.out.println("Polidrom: " + m.czyTekstJestPolidromem(tekst));




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
