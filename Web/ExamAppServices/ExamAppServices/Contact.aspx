<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPages/MasterPage.master" AutoEventWireup="true" CodeFile="Contact.aspx.cs" Inherits="Contact" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
    <style type="text/css">
    .auto-style3 {
        width: 587px;
        height: 30px;
        margin-top: 0px;
    }
    .auto-style4 {
        width: 587px;
        height: 30px;
        margin-left: 2px;
        margin-top: 0px;
    }
    .auto-style5 {
        width: 587px;
        height: 325px;
        margin-top: 0px;
    }
</style>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="cph1" Runat="Server">
    
    <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Enter your information in the form below and click "Send"</p>
<p>&nbsp;</p>
<p class="auto-style2">
        <asp:Label ID="Label1" runat="server" Text="Name:"></asp:Label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input id="Text1" type="text" class="auto-style3" /></p>
<p class="auto-style2">
        <asp:Label ID="Label2" runat="server" Text="Email:"></asp:Label>&nbsp;&nbsp;&nbsp; &nbsp;
        <input id="Text2" type="text" class="auto-style4" /></p>
<p class="auto-style2">
        <asp:Label ID="Label3" runat="server" Text="Message:"></asp:Label>&nbsp;&nbsp;<input id="Text3" type="text" class="auto-style5" /></p>

</asp:Content>

