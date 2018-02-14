<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Joe's Google Impression</title>
    <style type="text/css">
        html, body, form {
            height: 100%;
            margin: 0px;
            padding: 0px;
        }

        #div1 {
           height: 100%;
        }

        table {
            width: 100%;
            height: 100%;
            border-spacing: 0px;
            border: 0;
        }

        #table1 p.center {
            text-align: center;
        }

        tr {
           white-space: nowrap;
        }

        #tr2 {
            background-color: #CCCCCC;
            height: 3%
        }

        #td2 {
            width: 1px;
            height: auto;
        }

        #td9 {
            width: 1px;
            height: 1%;
        }

        #td10 {
            width: 1182px;
            height: 1%;
            text-align: right;
        }

        #td11 {
            width: auto;
            height: 1%;
            text-align: left;
        }

        .td1 {
            width: 146px;
            height: auto;
            text-align: right;
        }

        #p1 {
            width: 103px;
            height: auto;
        }

        #p6 {
            border-color: lightgray;
        }

        .auto1 {
            width: auto;
            height: 1%;
            text-align: center;
        }

        .left {
            text-align: left;
        }

        .auto-style44 {
            width: auto;
            height: auto;
            text-align: left;
        }

        .auto-style69 {
            white-space: nowrap;
            margin-left: 0px;
        }

        .auto-style72 {
            width: auto;
            height: 3%;
            text-align: center;
        }

        .auto-style73 {
            width: 1194px;
            height: 99%;
            text-align: center;
        }

        .auto-style75 {
            width: 1182px;
            height: 2%;
            text-align: right;
        }

        .auto-style77 {
            margin-left: 0px;
        }

        .auto-style80 {
            width: auto;
            height: 3%;
        }

        .auto-style89 {
            width: 146px;
            height: 1%;
            text-align: right;
        }

    </style>
</head>
<body>
    <form id="form1" runat="server">
        <div id="div1">

            <table id="table1">
                <tr>
                    <td id="td1">
                        <p id="p1">
                            &nbsp;&nbsp;&nbsp;&nbsp;
                            <asp:HyperLink ID="HyperLink1" runat="server" NavigateUrl="https://www.google.com/intl/en/about/?fg=1&amp;utm_source=google.com&amp;utm_medium=referral&amp;utm_campaign=hp-header" Font-Underline="False" Style="color: #000000">About</asp:HyperLink>
                            &nbsp;&nbsp;&nbsp;
                            <asp:HyperLink ID="HyperLink2" runat="server" Font-Underline="False" ForeColor="Black" NavigateUrl="https://store.google.com/?utm_source=hp_header&amp;utm_medium=google_oo&amp;utm_campaign=GS100042">Store</asp:HyperLink>
                        </p>
                    </td>
                    <td id="td2">
                        <p id="p2" class="left">
                            &nbsp;
                        </p>
                    </td>
                    <td id="td3" class="auto-style75">
                        <p>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <asp:HyperLink ID="HyperLink3" runat="server" Font-Underline="False" ForeColor="Black" NavigateUrl="https://www.google.com/gmail/about/#">Gmail</asp:HyperLink>
                        </p>
                    </td>
                    <td id="td4" class="auto-style44">
                        <p id="p3" class="center">
                            &nbsp;&nbsp;<asp:HyperLink ID="HyperLink4" runat="server" Font-Underline="False" ForeColor="Black" NavigateUrl="https://www.google.com/imghp?hl=en&amp;tab=wi">Images</asp:HyperLink>
                        </p>
                    </td>
                    <td id="td5" class="auto-style80">
                        <p id="p4" class="center">
                            &nbsp;<asp:HyperLink ID="HyperLink13" runat="server" ImageUrl="~/Images/GoogleAppsIcon.PNG" NavigateUrl="https://gsuite.google.com/">HyperLink</asp:HyperLink>
                        </p>
                    </td>
                    <td id="td6" class="auto-style72">
                        <p>
                            <asp:HyperLink ID="HyperLink6" runat="server" Font-Underline="False" ForeColor="Black" NavigateUrl="https://accounts.google.com/signin/v2/identifier?hl=en&amp;passive=true&amp;continue=https%3A%2F%2Fwww.google.com%2F&amp;flowName=GlifWebSignIn&amp;flowEntry=ServiceLogin">Sign In</asp:HyperLink>
                        </p>
                    </td>

                </tr>
                <tr>

                    <td id="td7" class="auto-style73" style="width: 100%" colspan="10" aria-label="Search">
                        <p>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <asp:Image ID="Image1" runat="server" ImageUrl="~/Images/logo.png" />

                            <br />

                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                            &nbsp;&nbsp;<asp:TextBox ID="TextBox1" runat="server" CssClass="auto-style69" Height="42px" Width="579px" BorderStyle="Outset" Font-Underline="False" ToolTip="Search" Wrap="False"></asp:TextBox>
                            &nbsp;&nbsp;
                        <br />
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        </p>
                        <p>
                            &nbsp;<asp:Button ID="Button3" runat="server" CssClass="auto-style69" Height="35px" OnClick="Button3_Click" Text="Google Search" Width="120px" />
                            &nbsp;
                        <asp:Button ID="Button4" runat="server" Height="35px" OnClick="Button3_Click" Text="I'm Feeling Lucky" Width="120px" CssClass="auto-style69" />
                        </p>
                        <p>
                            &nbsp;
                        </p>
                        <p>
                            &nbsp;<asp:Label ID="Label1" runat="server" Text="This isn't Google's real homepage, but click here to  learn more about  "></asp:Label>
                            <asp:HyperLink ID="HyperLink12" runat="server" ForeColor="#0066FF" NavigateUrl="https://www.google.com/culturalinstitute/beta/exhibit/xwKSlyiB8cFEIw">Black History Month</asp:HyperLink>
                        </p>
                    </td>

                </tr>

                <tr id="tr2">
                    <td id="td8" class="auto-style89">
                        <p id="p5" class="left">
                            &nbsp;&nbsp;
                            <asp:HyperLink ID="HyperLink5" runat="server" NavigateUrl="https://www.google.com/intl/en_us/ads/?subid=ww-ww-et-g-awa-a-g_hpafoot1_1!o2&amp;utm_source=google.com&amp;utm_medium=referral&amp;utm_campaign=google_hpafooter&amp;fg=1" Font-Underline="True" ForeColor="Gray">Advertising</asp:HyperLink>
                            &nbsp;&nbsp;&nbsp;
                            <asp:HyperLink ID="HyperLink7" runat="server" Font-Underline="True" ForeColor="Gray" NavigateUrl="https://www.google.com/services/?subid=ww-ww-et-g-awa-a-g_hpbfoot1_1!o2&amp;utm_source=google.com&amp;utm_medium=referral&amp;utm_campaign=google_hpbfooter&amp;fg=1#?modal_active=none">Business</asp:HyperLink>
                        </p>
                    </td>
                    <td id="td9">
                        <p id="p6" class="left">
                            &nbsp;
                        </p>
                    </td>
                    <td id="td10">
                        <p>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        </p>
                    </td>
                    <td id="td11">
                        <p>
                            <asp:HyperLink ID="HyperLink9" runat="server" Font-Underline="True" ForeColor="Gray" NavigateUrl="https://www.google.com/intl/en_us/policies/privacy/?fg=1">Privacy</asp:HyperLink>
                        </p>
                    </td>
                    <td id="td12" class="auto1">&nbsp;<asp:HyperLink ID="HyperLink11" runat="server" Font-Underline="True" ForeColor="Gray" NavigateUrl="https://www.google.com/intl/en_us/policies/terms/?fg=1">Terms</asp:HyperLink>
                    </td>
                    <td id="td13" class="auto1">
                        <p id="p7" class="center">
                            &nbsp;&nbsp;<asp:HyperLink ID="HyperLink10" runat="server" Font-Underline="True" ForeColor="Gray" NavigateUrl="https://www.google.com/preferences?hl=en&amp;fg=1">Settings</asp:HyperLink>
                        </p>
                    </td>

                </tr>
            </table>

        </div>
    </form>
</body>
</html>
