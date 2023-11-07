<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="vi">

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="A Hotel Booking website for Muong Thanh Hospitality" />
        <link rel="shortcut icon" href="assets/ico/logo-muong-thanh.ico" />
        <title>JSP Page</title>

        <!--Link picoCss file-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@picocss/pico@1.5.10/css/pico.min.css">
        <!--Link google Fonts and Material Icon Symbol-->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Brygada+1918">
        <link href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined" rel="stylesheet" />
        <!-- Link custom css -->
        <link rel="stylesheet" href="assets/custom.css" />

    </head>

    <body>
        <jsp:declaration>
            String email;
        </jsp:declaration>
        <%
            // Lấy giá trị của một tham số từ request
            email = request.getParameter("email");
        %>

        <jsp:include page="modules/header.jsp" flush="true" />

        <div class="container">
            <article style="height: 300px; text-align: center;">
                <h3>Booking success</h3>
                <p>We will send to <%=email%> an email</p>
            </article>
        </div>

        <jsp:include page="modules/footer.jsp" flush="true" />
        <!--Link JS file for Modal-->
        <script src="https://cdn.jsdelivr.net/npm/@picocss/pico@1.5.10/css/postcss.config.min.js"></script>
    </body>

</html>