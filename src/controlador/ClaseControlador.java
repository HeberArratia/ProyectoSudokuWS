package controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClaseControlador
 */
@WebServlet("/ClaseControlador")
public class ClaseControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Sudoku sdk = new Sudoku();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClaseControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // cuadrado A
		 String a00 = request.getParameter("a00");
		 String a01 = request.getParameter("a01");
		 String a02 = request.getParameter("a02");
		 
		 String a10 = request.getParameter("a10");
		 String a11 = request.getParameter("a11");
		 String a12 = request.getParameter("a12");
		 
		 String a20 = request.getParameter("a20");
		 String a21 = request.getParameter("a21");
		 String a22 = request.getParameter("a22");
		 
		 // cuadrado B
		 String b00 = request.getParameter("b00");
		 String b01 = request.getParameter("b01");
		 String b02 = request.getParameter("b02");
		 
		 String b10 = request.getParameter("b10");
		 String b11 = request.getParameter("b11");
		 String b12 = request.getParameter("b12");
		 
		 String b20 = request.getParameter("b20");
		 String b21 = request.getParameter("b21");
		 String b22 = request.getParameter("b22");
		 
		 // cuadrado C
		 String c00 = request.getParameter("c00");
		 String c01 = request.getParameter("c01");
		 String c02 = request.getParameter("c02");
		 
		 String c10 = request.getParameter("c10");
		 String c11 = request.getParameter("c11");
		 String c12 = request.getParameter("c12");
		 
		 String c20 = request.getParameter("c20");
		 String c21 = request.getParameter("c21");
		 String c22 = request.getParameter("c22");
		 
		 // cuadrado D
		 String d00 = request.getParameter("d00");
		 String d01 = request.getParameter("d01");
		 String d02 = request.getParameter("d02");
		 
		 String d10 = request.getParameter("d10");
		 String d11 = request.getParameter("d11");
		 String d12 = request.getParameter("d12");
		 
		 String d20 = request.getParameter("d20");
		 String d21 = request.getParameter("d21");
		 String d22 = request.getParameter("d22");
		 
		 // cuadrado E
		 String e00 = request.getParameter("e00");
		 String e01 = request.getParameter("e01");
		 String e02 = request.getParameter("e02");
		 
		 String e10 = request.getParameter("e10");
		 String e11 = request.getParameter("e11");
		 String e12 = request.getParameter("e12");
		 
		 String e20 = request.getParameter("e20");
		 String e21 = request.getParameter("e21");
		 String e22 = request.getParameter("e22");
		 
		 // cuadrado F
		 String f00 = request.getParameter("f00");
		 String f01 = request.getParameter("f01");
		 String f02 = request.getParameter("f02");
		 
		 String f10 = request.getParameter("f10");
		 String f11 = request.getParameter("f11");
		 String f12 = request.getParameter("f12");
		 
		 String f20 = request.getParameter("f20");
		 String f21 = request.getParameter("f21");
		 String f22 = request.getParameter("f22");
		 
		 // cuadrado G
		 String g00 = request.getParameter("g00");
		 String g01 = request.getParameter("g01");
		 String g02 = request.getParameter("g02");
		 
		 String g10 = request.getParameter("g10");
		 String g11 = request.getParameter("g11");
		 String g12 = request.getParameter("g12");
		 
		 String g20 = request.getParameter("g20");
		 String g21 = request.getParameter("g21");
		 String g22 = request.getParameter("g22");
		 
		 // cuadrado H
		 String h00 = request.getParameter("h00");
		 String h01 = request.getParameter("h01");
		 String h02 = request.getParameter("h02");
		 
		 String h10 = request.getParameter("h10");
		 String h11 = request.getParameter("h11");
		 String h12 = request.getParameter("h12");
		 
		 String h20 = request.getParameter("h20");
		 String h21 = request.getParameter("h21");
		 String h22 = request.getParameter("h22");
		 
		 // cuadrado I
		 String i00 = request.getParameter("i00");
		 String i01 = request.getParameter("i01");
		 String i02 = request.getParameter("i02");
		 
		 String i10 = request.getParameter("i10");
		 String i11 = request.getParameter("i11");
		 String i12 = request.getParameter("i12");
		 
		 String i20 = request.getParameter("i20");
		 String i21 = request.getParameter("i21");
		 String i22 = request.getParameter("i22");
		 
		 // A
		 sdk.almacenarDato(a00, 0, 0, 0,0,0);
		 sdk.almacenarDato(a01, 0, 1, 0,0,0);
		 sdk.almacenarDato(a02, 0, 2, 0,0,0);
		 
		 sdk.almacenarDato(a10, 1, 0, 0,0,0);
		 sdk.almacenarDato(a11, 1, 1, 0,0,0);
		 sdk.almacenarDato(a12, 1, 2, 0,0,0);                               
		 
		 sdk.almacenarDato(a20, 2, 0, 0,0,0);
		 sdk.almacenarDato(a21, 2, 1, 0,0,0);                         
		 sdk.almacenarDato(a22, 2, 2, 0,0,0);
         // B                          
		 sdk.almacenarDato(b00, 0, 0, 1,0,1);
		 sdk.almacenarDato(b01, 0, 1, 1,0,1);
		 sdk.almacenarDato(b02, 0, 2, 1,0,1);
		 
		 sdk.almacenarDato(b10, 1, 0, 1,0,1);
		 sdk.almacenarDato(b11, 1, 1, 1,0,1);
		 sdk.almacenarDato(b12, 1, 2, 1,0,1);
                                                       
		 sdk.almacenarDato(b20, 2, 0, 1,0,1);
		 sdk.almacenarDato(b21, 2, 1, 1,0,1);
		 sdk.almacenarDato(b22, 2, 2, 1,0,1);                                                 
		 // C
		 sdk.almacenarDato(c00, 0, 0, 2,0,2);
		 sdk.almacenarDato(c01, 0, 1, 2,0,2);
		 sdk.almacenarDato(c02, 0, 2, 2,0,2);
         
		 sdk.almacenarDato(c10, 1, 0, 2,0,2);
		 sdk.almacenarDato(c11, 1, 1, 2,0,2);
		 sdk.almacenarDato(c12, 1, 2, 2,0,2);                    

		 sdk.almacenarDato(c20, 2, 0, 2,0,2);
		 sdk.almacenarDato(c21, 2, 1, 2,0,2);
		 sdk.almacenarDato(c22, 2, 2, 2,0,2);                 
		 // D
		 sdk.almacenarDato(d00, 0, 0, 3,3,0);
		 sdk.almacenarDato(d01, 0, 1, 3,3,0);
		 sdk.almacenarDato(d02, 0, 2, 3,3,0);
		 
		 sdk.almacenarDato(d10, 1, 0, 3,3,0);
		 sdk.almacenarDato(d11, 1, 1, 3,3,0);
		 sdk.almacenarDato(d12, 1, 2, 3,3,0);
		 
		 sdk.almacenarDato(d20, 2, 0, 3,3,0);
		 sdk.almacenarDato(d21, 2, 1, 3,3,0);
		 sdk.almacenarDato(d22, 2, 2, 3,3,0);
         // E            
		 sdk.almacenarDato(e00, 0, 0, 4,3,1);
		 sdk.almacenarDato(e01, 0, 1, 4,3,1);
		 sdk.almacenarDato(e02, 0, 2, 4,3,1);
		 
		 sdk.almacenarDato(e10, 1, 0, 4,3,1);
		 sdk.almacenarDato(e11, 1, 1, 4,3,1);
		 sdk.almacenarDato(e12, 1, 2, 4,3,1);
		 
		 sdk.almacenarDato(e20, 2, 0, 4,3,1);
		 sdk.almacenarDato(e21, 2, 1, 4,3,1);
		 sdk.almacenarDato(e22, 2, 2, 4,3,1);
         // F 
		 sdk.almacenarDato(f00, 0, 0, 5,3,2);
		 sdk.almacenarDato(f01, 0, 1, 5,3,2);
		 sdk.almacenarDato(f02, 0, 2, 5,3,2);
		 
		 sdk.almacenarDato(f10, 1, 0, 5,3,2);
		 sdk.almacenarDato(f11, 1, 1, 5,3,2);
		 sdk.almacenarDato(f12, 1, 2, 5,3,2);
         
		 sdk.almacenarDato(f20, 2, 0, 5,3,2);
		 sdk.almacenarDato(f21, 2, 1, 5,3,2);
		 sdk.almacenarDato(f22, 2, 2, 5,3,2);
         // G
		 sdk.almacenarDato(g00, 0, 0, 6,6,0);
		 sdk.almacenarDato(g01, 0, 1, 6,6,0);
		 sdk.almacenarDato(g02, 0, 2, 6,6,0);
		 
		 sdk.almacenarDato(g10, 1, 0, 6,6,0);
		 sdk.almacenarDato(g11, 1, 1, 6,6,0);
		 sdk.almacenarDato(g12, 1, 2, 6,6,0);
		 
		 sdk.almacenarDato(g20, 2, 0, 6,6,0);
		 sdk.almacenarDato(g21, 2, 1, 6,6,0);
		 sdk.almacenarDato(g22, 2, 2, 6,6,0);
		 // H
		 sdk.almacenarDato(h00, 0, 0, 7,6,1);
		 sdk.almacenarDato(h01, 0, 1, 7,6,1);
		 sdk.almacenarDato(h02, 0, 2, 7,6,1);
		 
		 sdk.almacenarDato(h10, 1, 0, 7,6,1);
		 sdk.almacenarDato(h11, 1, 1, 7,6,1);
		 sdk.almacenarDato(h12, 1, 2, 7,6,1);
		 
		 sdk.almacenarDato(h20, 2, 0, 7,6,1);
		 sdk.almacenarDato(h21, 2, 1, 7,6,1);
		 sdk.almacenarDato(h22, 2, 2, 7,6,1);
		 // I
		 sdk.almacenarDato(i00, 0, 0, 8,6,2);
		 sdk.almacenarDato(i01, 0, 1, 8,6,2);
		 sdk.almacenarDato(i02, 0, 2, 8,6,2);
		 
		 sdk.almacenarDato(i10, 1, 0, 8,6,2);
		 sdk.almacenarDato(i11, 1, 1, 8,6,2);
		 sdk.almacenarDato(i12, 1, 2, 8,6,2);
                                                        
		 sdk.almacenarDato(i20, 2, 0, 8,6,2);
		 sdk.almacenarDato(i22, 2, 2, 8,6,2);
		 sdk.almacenarDato(i21, 2, 1, 8,6,2);                      
		 String comprobar = sdk.comprobarSudoku();
		 
		 request.setAttribute("mensaje","" + comprobar + "");  
		 request.getRequestDispatcher("/index.jsp").forward(request, response);
		 
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
