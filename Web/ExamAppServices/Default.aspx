<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style type="text/css">
        .auto-style1 {
            font-size: 48px;
            padding: 20px
        }

        ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;
            background-color: #000000;
            border: 1px solid white;
            height: 82px;
        }

        li {
            float: left;
        }

            li a {
                display: block;
                color: white;
                text-align: center;
                padding: 30px;
                text-decoration: none;
                border: 1px solid gray
            }

                li a:hover {
                    background-color: #111111;
                }
        .auto-style3 {
            font-weight: normal;
            font-size: xx-large;
            text-align: center;
        }
    </style>
</head>
<body style="height: 76px; font-size: x-large;">
    <form id="form1" runat="server">
        <div class="auto-style1" style="color: #FFFFFF; text-align: center; background-color: #000000">
            <strong>Welcome to Exam App Services Inc.
        </strong>
        </div>
    </form>
</body>


<ul>
    <li><a href="#home">Home</a></li>
    <li><a href="About.aspx">About</a></li>
    <li><a href="news.aspx">News</a></li>
    <li><a href="services.aspx">Services</a></li>
    <li><a href="contact.aspx">Contact</a></li>
</ul>


    <p>
        &nbsp;</p>
    <p style="font-style: italic; text-align: left">
&nbsp;</p>
    <h1 class="auto-style3"><em>“Education is the Most Powerful Weapon</em></h1>
    <h1 class="auto-style3"><em>&nbsp;Which You Can Use to Change the World.” </em></h1>
    <h1 class="auto-style3"><em>– Nelson Mandela</em></h1>



</html>
