<%-- 
    Document   : Add_Banner
    Created on : Jul 31, 2018, 9:50:43 AM
    Author     : APTA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- Meta, title, CSS, favicons, etc. -->
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <title>Admin Panel</title>

  <!-- Bootstrap core CSS -->

  <link href="css/bootstrap.min.css" rel="stylesheet">

  <link href="fonts/css/font-awesome.min.css" rel="stylesheet">
  <link href="css/animate.min.css" rel="stylesheet">

  <!-- Custom styling plus plugins -->
  <link href="css/custom.css" rel="stylesheet">
  <link href="css/icheck/flat/green.css" rel="stylesheet">

  <link href="js/datatables/jquery.dataTables.min.css" rel="stylesheet" type="text/css" />
  <link href="js/datatables/buttons.bootstrap.min.css" rel="stylesheet" type="text/css" />
  <link href="js/datatables/fixedHeader.bootstrap.min.css" rel="stylesheet" type="text/css" />
  <link href="js/datatables/responsive.bootstrap.min.css" rel="stylesheet" type="text/css" />
  <link href="js/datatables/scroller.bootstrap.min.css" rel="stylesheet" type="text/css" />

  <script src="js/jquery.min.js"></script>

  <!--[if lt IE 9]>
        <script src="../assets/js/ie8-responsive-file-warning.js"></script>
        <![endif]-->

  <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
  <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

</head>

<%
    if(session.getAttribute("email")==null)
    {
        response.sendRedirect("index.jsp");
    }
    else
    {
%>
<body class="nav-md">

 	<div class="container body">
		<div class="main_container">
			<div class="col-md-3 left_col">
				<div class="left_col scroll-view">
                                      <jsp:include page="include/header.jsp"></jsp:include>

					
					<!-- sidebar menu -->
					 <jsp:include page="include/sidebar.jsp"></jsp:include>

					<!-- /sidebar menu -->

					<!-- /menu footer buttons -->
				
					<!-- /menu footer buttons -->
				</div>
			</div>

			<!-- top navigation -->
					 <jsp:include page="include/nav.jsp"></jsp:include>
			<!-- /top navigation -->


			<!-- page content -->
			<div class="right_col" role="main">

				<div class="row">
					<div class="col-md-12 col-sm-12 col-xs-12">
						<div class="dashboard_graph">

							<div class="row x_title">
								<div class="col-md-6">
                                                                    <h3>View Vendor <small><a href="view_Subscription.jsp"><button class="btn-lg btn btn-outline btn-success">Subscription Request</button></a></small> </h3>
								</div>
								<div class="col-md-6">

								</div>
							</div>
           <div class="col-md-12 col-sm-12 col-xs-12">
               <div class="x_panel">
                <div class="x_title">
                  <h2> View Vendor<small>Here</small></h2>
                  <ul class="nav navbar-right panel_toolbox">
                    <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                    </li>
                    <li><a class="close-link"><i class="fa fa-close"></i></a>
                    </li>
                  </ul>
                  <div class="clearfix"></div>
                </div>
                <div class="x_content">
            
                  <table id="datatable" class="table table-striped table-bordered">
                    <thead>
                      <tr>
                        <th>Vendor Name</th>
                        <th>Vendor Email</th>
                         <th>Mobile Number</th>
                          <th>Subscription Period</th>
                          <th>Status</th>
                           <th>Edit</th>
                          <th>Delete</th>
                       </tr>
                    </thead>


                    <tbody>
                      <tr>
                        <td>Maninder Duhan</td>
                        <td>xyz@xzzz.s</td>
                        <td>9999999999</td>
                        <td>30 days</td>
                        <td>Active</td>
                        <td><a href="" class="btn btn-info btn-xs"><i class="fa fa-pencil"></i> Edit </a>
                          </td>
                        <td> <a href="#" class="btn btn-danger btn-xs"  onclick="if(confirm('Sure Want?')){return true;} else{return false;};"><i class="fa  fa-trash-o"></i> Delete </a>
                          </td>
                       
                      </tr>
                     
                    </tbody>
                  </table>
                </div>
              </div>
            </div>

                                                </div>
                  </div>
                </div>
              </div>
              <!-- footer content -->
               <jsp:include page="include/footer.jsp"></jsp:include>
   <!-- /footer content -->

            </div>
            <!-- /page content -->
          </div>

        </div>

        <div id="custom_notifications" class="custom-notifications dsp_none">
          <ul class="list-unstyled notifications clearfix" data-tabbed_notifications="notif-group">
          </ul>
          <div class="clearfix"></div>
          <div id="notif-group" class="tabbed_notifications"></div>
        </div>

        <script src="js/bootstrap.min.js"></script>

        <!-- bootstrap progress js -->
        <script src="js/progressbar/bootstrap-progressbar.min.js"></script>
        <script src="js/nicescroll/jquery.nicescroll.min.js"></script>
        <!-- icheck -->
        <script src="js/icheck/icheck.min.js"></script>

        <script src="js/custom.js"></script>


        <!-- Datatables -->
        <!-- <script src="js/datatables/js/jquery.dataTables.js"></script>
  <script src="js/datatables/tools/js/dataTables.tableTools.js"></script> -->

        <!-- Datatables-->
        <script src="js/datatables/jquery.dataTables.min.js"></script>
        <script src="js/datatables/dataTables.bootstrap.js"></script>
        <script src="js/datatables/dataTables.buttons.min.js"></script>
        <script src="js/datatables/buttons.bootstrap.min.js"></script>
        <script src="js/datatables/jszip.min.js"></script>
        <script src="js/datatables/pdfmake.min.js"></script>
        <script src="js/datatables/vfs_fonts.js"></script>
        <script src="js/datatables/buttons.html5.min.js"></script>
        <script src="js/datatables/buttons.print.min.js"></script>
        <script src="js/datatables/dataTables.fixedHeader.min.js"></script>
        <script src="js/datatables/dataTables.keyTable.min.js"></script>
        <script src="js/datatables/dataTables.responsive.min.js"></script>
        <script src="js/datatables/responsive.bootstrap.min.js"></script>
        <script src="js/datatables/dataTables.scroller.min.js"></script>


        <!-- pace -->
        <script src="js/pace/pace.min.js"></script>
        <script>
          var handleDataTableButtons = function() {
              "use strict";
              0 !== $("#datatable-buttons").length && $("#datatable-buttons").DataTable({
                dom: "Bfrtip",
                buttons: [{
                  extend: "copy",
                  className: "btn-sm"
                }, {
                  extend: "csv",
                  className: "btn-sm"
                }, {
                  extend: "excel",
                  className: "btn-sm"
                }, {
                  extend: "pdf",
                  className: "btn-sm"
                }, {
                  extend: "print",
                  className: "btn-sm"
                }],
                responsive: !0
              })
            },
            TableManageButtons = function() {
              "use strict";
              return {
                init: function() {
                  handleDataTableButtons()
                }
              }
            }();
        </script>
        <script type="text/javascript">
          $(document).ready(function() {
            $('#datatable').dataTable();
            $('#datatable-keytable').DataTable({
              keys: true
            });
            $('#datatable-responsive').DataTable();
            $('#datatable-scroller').DataTable({
              ajax: "js/datatables/json/scroller-demo.json",
              deferRender: true,
              scrollY: 380,
              scrollCollapse: true,
              scroller: true
            });
            var table = $('#datatable-fixed-header').DataTable({
              fixedHeader: true
            });
          });
          TableManageButtons.init();
        </script>
</body>
<%
    }
%>
</html>
