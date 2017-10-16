package com.marcastr0

import javax.servlet.http._

class HelloWorldServlet extends HttpServlet {

  override def doGet(request: HttpServletRequest, response: HttpServletResponse) {
    response.setContentType("text/html")
    response.setCharacterEncoding("UTF-8")
    response.getWriter.write("""<h1>Hello, world!</h1>""")
  }

}