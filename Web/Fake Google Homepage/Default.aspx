<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Joe's Google Impression</title>
    <link href="Styles.css" rel="stylesheet" />

</head>
<body>
    <form id="form1" runat="server">
        <div id="div1">

            <table id="table1">
                <tr id="tr1">
                    <td id="td1">
                        <p id="p1">
                            &nbsp;&nbsp;&nbsp;&nbsp;
                            <asp:HyperLink ID="HyperLink1" runat="server" NavigateUrl="https://www.google.com/intl/en/about/?fg=1&amp;utm_source=google.com&amp;utm_medium=referral&amp;utm_campaign=hp-header">About</asp:HyperLink>
                            &nbsp;&nbsp;&nbsp;
                            <asp:HyperLink ID="HyperLink2" runat="server" NavigateUrl="https://store.google.com/?utm_source=hp_header&amp;utm_medium=google_oo&amp;utm_campaign=GS100042">Store</asp:HyperLink>
                        </p>
                    </td>
                    <td id="td2">
                        <p id="p2" class="left">
                            &nbsp;
                        </p>
                    </td>
                    <td id="td3">
                        <p>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <asp:HyperLink ID="HyperLink3" runat="server" NavigateUrl="https://www.google.com/gmail/about/#">Gmail</asp:HyperLink>
                        </p>
                    </td>
                    <td id="td4">
                        <p id="p3" class="center">
                            &nbsp;&nbsp;<asp:HyperLink ID="HyperLink4" runat="server" NavigateUrl="https://www.google.com/imghp?hl=en&amp;tab=wi">Images</asp:HyperLink>
                        </p>
                    </td>
                    <td id="td5">
                        <p id="p4" class="center">
                            &nbsp;<asp:HyperLink ID="HyperLink8" runat="server" ImageUrl="~/Images/GoogleAppsIcon.PNG" NavigateUrl="https://gsuite.google.com/">HyperLink</asp:HyperLink>
                        </p>
                    </td>
                    <td id="td6">
                        <p>
                            <asp:HyperLink ID="HyperLink6" runat="server" NavigateUrl="https://accounts.google.com/signin/v2/identifier?hl=en&amp;passive=true&amp;continue=https%3A%2F%2Fwww.google.com%2F&amp;flowName=GlifWebSignIn&amp;flowEntry=ServiceLogin">Sign In</asp:HyperLink>
                        </p>
                    </td>

                </tr>
                <tr>

                    <td id="td7" colspan="10" aria-label="Search">
                        <p id="p8">
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <asp:Image ID="Image1" runat="server" ImageUrl="~/Images/logo.png" />

                            <br />

                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                            &nbsp;&nbsp;<asp:TextBox ID="TextBox1" runat="server" CssClass="aspElement" Font-Underline="False" ToolTip="Search" Wrap="False" Width="579px"></asp:TextBox>
                            &nbsp;&nbsp;
                        <br />

                        </p>
                        <p>
                            &nbsp;<asp:Button ID="Button3" runat="server" CssClass="aspElement" OnClick="Button3_Click" Text="Google Search" />
                            &nbsp;
                        <asp:Button ID="Button4" runat="server" CssClass="aspElement" OnClick="Button4_Click" Text="I'm Feeling Lucky" />
                        </p>
                        <p>
                            &nbsp;
                        </p>
                        <p id="p9">
                            &nbsp;
                        </p>
                        <p id="p11">
                            &nbsp;This isn't Google's real homepage, but click here to  learn more about
                            <asp:HyperLink ID="HyperLink12" runat="server" NavigateUrl="https://www.google.com/culturalinstitute/beta/exhibit/xwKSlyiB8cFEIw">Black History Month</asp:HyperLink>
                        </p>
                    </td>

                </tr>

                <tr id="tr2">
                    <td id="td8">
                        <p id="p5" class="left">
                            &nbsp;&nbsp;
                            <asp:HyperLink ID="HyperLink5" runat="server" NavigateUrl="https://www.google.com/intl/en_us/ads/?subid=ww-ww-et-g-awa-a-g_hpafoot1_1!o2&amp;utm_source=google.com&amp;utm_medium=referral&amp;utm_campaign=google_hpafooter&amp;fg=1">Advertising</asp:HyperLink>
                            &nbsp;&nbsp;&nbsp;
                            <asp:HyperLink ID="HyperLink7" runat="server" NavigateUrl="https://www.google.com/services/?subid=ww-ww-et-g-awa-a-g_hpbfoot1_1!o2&amp;utm_source=google.com&amp;utm_medium=referral&amp;utm_campaign=google_hpbfooter&amp;fg=1#?modal_active=none">Business</asp:HyperLink>
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
                            <asp:HyperLink ID="HyperLink9" runat="server" NavigateUrl="https://www.google.com/intl/en_us/policies/privacy/?fg=1">Privacy</asp:HyperLink>
                        </p>
                    </td>
                    <td id="td12">&nbsp;<asp:HyperLink ID="HyperLink11" runat="server" NavigateUrl="https://www.google.com/intl/en_us/policies/terms/?fg=1">Terms</asp:HyperLink>
                    </td>
                    <td id="td13" class="auto1">
                        <p id="p7" class="center">
                            &nbsp;&nbsp;<asp:HyperLink ID="HyperLink10" runat="server" NavigateUrl="https://www.google.com/preferences?hl=en&amp;fg=1">Settings</asp:HyperLink>
                        </p>
                    </td>

                </tr>
            </table>

        </div>
    </form>
</body>
</html>
