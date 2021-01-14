(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["tables-tables-module"],{

/***/ "./node_modules/raw-loader/dist/cjs.js!./src/app/tables/datatable.net/datatable.component.html":
/*!*****************************************************************************************************!*\
  !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/tables/datatable.net/datatable.component.html ***!
  \*****************************************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("<div class=\"main-content\">\r\n        <div class=\"row\">\r\n            <div class=\"col-md-12\">\r\n\r\n                <div class=\"card\">\r\n                  <div class=\"card-header\">\r\n                    <h4 class=\"card-title\">DataTables.net</h4>\r\n                  </div>\r\n                    <div class=\"card-body\">\r\n                      <div class=\"toolbar\">\r\n                            <!--        Here you can write extra buttons/actions for the toolbar              -->\r\n                        </div>\r\n                          <table id=\"datatable\" class=\"table table-striped table-bordered\" cellspacing=\"0\" width=\"100%\">\r\n                                <thead>\r\n                                    <tr>\r\n                                      <th>{{ dataTable.headerRow[0] }}</th>\r\n                                      <th>{{ dataTable.headerRow[1] }}</th>\r\n                                      <th>{{ dataTable.headerRow[2] }}</th>\r\n                                      <th>{{ dataTable.headerRow[3] }}</th>\r\n                                      <th>{{ dataTable.headerRow[4] }}</th>\r\n                                      <th class=\"disabled-sorting text-right\">{{ dataTable.headerRow[5] }}</th>\r\n                                    </tr>\r\n                                </thead>\r\n                                <tfoot>\r\n                                    <tr>\r\n                                      <th>{{ dataTable.footerRow[0] }}</th>\r\n                                      <th>{{ dataTable.footerRow[1] }}</th>\r\n                                      <th>{{ dataTable.footerRow[2] }}</th>\r\n                                      <th>{{ dataTable.footerRow[3] }}</th>\r\n                                      <th>{{ dataTable.footerRow[4] }}</th>\r\n                                      <th>{{ dataTable.footerRow[5] }}</th>\r\n                                    </tr>\r\n                                </tfoot>\r\n                                <tbody>\r\n                                    <tr *ngFor=\"let row of dataTable.dataRows\">\r\n                                        <td>{{row[0]}}</td>\r\n                                        <td>{{row[1]}}</td>\r\n                                        <td>{{row[2]}}</td>\r\n                                        <td>{{row[3]}}</td>\r\n                                        <td>{{row[4]}}</td>\r\n                                        <td class=\"text-right\">\r\n                                          <a href=\"javascript:void(0)\" class=\"btn btn-info btn-link btn-icon btn-sm like\"><i class=\"fa fa-heart\"></i></a>\r\n                                          <a href=\"javascript:void(0)\" class=\"btn btn-warning btn-link btn-icon btn-sm edit\"><i class=\"fa fa-edit\"></i></a>\r\n                                          <a href=\"javascript:void(0)\" class=\"btn btn-danger btn-link btn-icon btn-sm remove\"><i class=\"fa fa-times\"></i></a>\r\n                                        </td>\r\n\r\n                                    </tr>\r\n                                </tbody>\r\n                            </table>\r\n                    </div>\r\n                    <!-- end content-->\r\n                </div>\r\n                <!--  end card  -->\r\n            </div>\r\n            <!-- end col-md-12 -->\r\n        </div>\r\n        <!-- end row -->\r\n</div>\r\n");

/***/ }),

/***/ "./node_modules/raw-loader/dist/cjs.js!./src/app/tables/extendedtable/extendedtable.component.html":
/*!*********************************************************************************************************!*\
  !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/tables/extendedtable/extendedtable.component.html ***!
  \*********************************************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("<div class=\"main-content\">\r\n  <div class=\"row\">\r\n    <div class=\"col-md-12\">\r\n      <div class=\"card\">\r\n        <div class=\"card-header\">\r\n          <h4 class=\"card-title\"> Simple Table</h4>\r\n        </div>\r\n        <div class=\"card-body\">\r\n          <div class=\"table-responsive\">\r\n            <table class=\"table\">\r\n              <thead class=\"text-primary\">\r\n                <th class=\"text-center\">\r\n                  #\r\n                </th>\r\n                <th>\r\n                  Name\r\n                </th>\r\n                <th>\r\n                  Job Position\r\n                </th>\r\n                <th class=\"text-center\">\r\n                  Since\r\n                </th>\r\n                <th class=\"text-right\">\r\n                  Salary\r\n                </th>\r\n                <th class=\"text-right\">\r\n                  Actions\r\n                </th>\r\n              </thead>\r\n              <tbody>\r\n                <tr>\r\n                  <td class=\"text-center\">\r\n                    1\r\n                  </td>\r\n                  <td>\r\n                    Andrew Mike\r\n                  </td>\r\n                  <td>\r\n                    Develop\r\n                  </td>\r\n                  <td class=\"text-center\">\r\n                    2013\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    € 99,225\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    <button type=\"button\" rel=\"tooltip\" class=\"btn btn-info btn-icon btn-sm \">\r\n                      <i class=\"fa fa-user\"></i>\r\n                    </button>\r\n                    <button type=\"button\" rel=\"tooltip\" class=\"btn btn-success btn-icon btn-sm \">\r\n                      <i class=\"fa fa-edit\"></i>\r\n                    </button>\r\n                    <button type=\"button\" rel=\"tooltip\" class=\"btn btn-danger btn-icon btn-sm \">\r\n                      <i class=\"fa fa-times\"></i>\r\n                    </button>\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td class=\"text-center\">\r\n                    2\r\n                  </td>\r\n                  <td>\r\n                    John Doe\r\n                  </td>\r\n                  <td>\r\n                    Design\r\n                  </td>\r\n                  <td class=\"text-center\">\r\n                    2012\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    € 89,241\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    <button type=\"button\" rel=\"tooltip\" class=\"btn btn-info btn-icon btn-sm \">\r\n                      <i class=\"fa fa-user\"></i>\r\n                    </button>\r\n                    <button type=\"button\" rel=\"tooltip\" class=\"btn btn-success btn-icon btn-sm \">\r\n                      <i class=\"fa fa-edit\"></i>\r\n                    </button>\r\n                    <button type=\"button\" rel=\"tooltip\" class=\"btn btn-danger btn-icon btn-sm \">\r\n                      <i class=\"fa fa-times\"></i>\r\n                    </button>\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td class=\"text-center\">\r\n                    3\r\n                  </td>\r\n                  <td>\r\n                    Alex Mike\r\n                  </td>\r\n                  <td>\r\n                    Design\r\n                  </td>\r\n                  <td class=\"text-center\">\r\n                    2010\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    € 92,144\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    <button type=\"button\" rel=\"tooltip\" class=\"btn btn-info btn-icon btn-sm \">\r\n                      <i class=\"fa fa-user\"></i>\r\n                    </button>\r\n                    <button type=\"button\" rel=\"tooltip\" class=\"btn btn-success btn-icon btn-sm \">\r\n                      <i class=\"fa fa-edit\"></i>\r\n                    </button>\r\n                    <button type=\"button\" rel=\"tooltip\" class=\"btn btn-danger btn-icon btn-sm \">\r\n                      <i class=\"fa fa-times\"></i>\r\n                    </button>\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td class=\"text-center\">\r\n                    4\r\n                  </td>\r\n                  <td>\r\n                    Mike Monday\r\n                  </td>\r\n                  <td>\r\n                    Marketing\r\n                  </td>\r\n                  <td class=\"text-center\">\r\n                    2013\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    € 49,990\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    <button type=\"button\" rel=\"tooltip\" class=\"btn btn-info btn-icon btn-sm   btn-neutral  \">\r\n                      <i class=\"fa fa-user\"></i>\r\n                    </button>\r\n                    <button type=\"button\" rel=\"tooltip\" class=\"btn btn-success btn-icon btn-sm   btn-neutral  \">\r\n                      <i class=\"fa fa-edit\"></i>\r\n                    </button>\r\n                    <button type=\"button\" rel=\"tooltip\" class=\"btn btn-danger btn-icon btn-sm   btn-neutral  \">\r\n                      <i class=\"fa fa-times\"></i>\r\n                    </button>\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td class=\"text-center\">\r\n                    5\r\n                  </td>\r\n                  <td>\r\n                    Paul Dickens\r\n                  </td>\r\n                  <td>\r\n                    Communication\r\n                  </td>\r\n                  <td class=\"text-center\">\r\n                    2015\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    € 69,201\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    <button type=\"button\" rel=\"tooltip\" class=\"btn btn-info btn-icon btn-sm   btn-neutral  \">\r\n                      <i class=\"fa fa-user\"></i>\r\n                    </button>\r\n                    <button type=\"button\" rel=\"tooltip\" class=\"btn btn-success btn-icon btn-sm   btn-neutral  \">\r\n                      <i class=\"fa fa-edit\"></i>\r\n                    </button>\r\n                    <button type=\"button\" rel=\"tooltip\" class=\"btn btn-danger btn-icon btn-sm   btn-neutral  \">\r\n                      <i class=\"fa fa-times\"></i>\r\n                    </button>\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td class=\"text-center\">\r\n                    6\r\n                  </td>\r\n                  <td>\r\n                    Manuel Rico\r\n                  </td>\r\n                  <td>\r\n                    Manager\r\n                  </td>\r\n                  <td class=\"text-center\">\r\n                    2012\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    € 99,201\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    <button type=\"button\" rel=\"tooltip\" class=\"btn btn-info btn-icon btn-sm   btn-neutral  \">\r\n                      <i class=\"fa fa-user\"></i>\r\n                    </button>\r\n                    <button type=\"button\" rel=\"tooltip\" class=\"btn btn-success btn-icon btn-sm   btn-neutral  \">\r\n                      <i class=\"fa fa-edit\"></i>\r\n                    </button>\r\n                    <button type=\"button\" rel=\"tooltip\" class=\"btn btn-danger btn-icon btn-sm   btn-neutral  \">\r\n                      <i class=\"fa fa-times\"></i>\r\n                    </button>\r\n                  </td>\r\n                </tr>\r\n              </tbody>\r\n            </table>\r\n          </div>\r\n        </div>\r\n      </div>\r\n    </div>\r\n    <div class=\"col-md-12\">\r\n      <div class=\"card\">\r\n        <div class=\"card-header\">\r\n          <h4 class=\"card-title\"> Striped Table with Checkboxes</h4>\r\n        </div>\r\n        <div class=\"card-body\">\r\n          <div class=\"table-responsive\">\r\n            <table class=\"table table-striped\">\r\n              <thead class=\"text-primary\">\r\n                <th class=\"text-center\">\r\n                  #\r\n                </th>\r\n                <th class=\"text-center\">\r\n                </th>\r\n                <th>\r\n                  Product Name\r\n                </th>\r\n                <th>\r\n                  Type\r\n                </th>\r\n                <th class=\"text-center\">\r\n                  Qty\r\n                </th>\r\n                <th class=\"text-right\">\r\n                  Price\r\n                </th>\r\n                <th class=\"text-right\">\r\n                  Amount\r\n                </th>\r\n              </thead>\r\n              <tbody>\r\n                <tr>\r\n                  <td class=\"text-center\">\r\n                    1\r\n                  </td>\r\n                  <td class=\"text-center\">\r\n                    <div class=\"form-check\">\r\n                      <label class=\"form-check-label\">\r\n                        <input class=\"form-check-input\" type=\"checkbox\" checked>\r\n                        <span class=\"form-check-sign\"></span>\r\n                      </label>\r\n                    </div>\r\n                  </td>\r\n                  <td>\r\n                    Moleskine Agenda\r\n                  </td>\r\n                  <td>\r\n                    Office\r\n                  </td>\r\n                  <td class=\"text-center\">\r\n                    25\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    € 49\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    € 1,225\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td class=\"text-center\">\r\n                    2\r\n                  </td>\r\n                  <td class=\"text-center\">\r\n                    <div class=\"form-check\">\r\n                      <label class=\"form-check-label\">\r\n                        <input class=\"form-check-input\" type=\"checkbox\">\r\n                        <span class=\"form-check-sign\"></span>\r\n                      </label>\r\n                    </div>\r\n                  </td>\r\n                  <td>\r\n                    Stabilo Pen\r\n                  </td>\r\n                  <td>\r\n                    Office\r\n                  </td>\r\n                  <td class=\"text-center\">\r\n                    30\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    € 10\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    € 300\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td class=\"text-center\">\r\n                    3\r\n                  </td>\r\n                  <td class=\"text-center\">\r\n                    <div class=\"form-check\">\r\n                      <label class=\"form-check-label\">\r\n                        <input class=\"form-check-input\" type=\"checkbox\" checked>\r\n                        <span class=\"form-check-sign\"></span>\r\n                      </label>\r\n                    </div>\r\n                  </td>\r\n                  <td>\r\n                    A4 Paper Pack\r\n                  </td>\r\n                  <td>\r\n                    Office\r\n                  </td>\r\n                  <td class=\"text-center\">\r\n                    50\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    € 10.99\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    € 109\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td class=\"text-center\">\r\n                    4\r\n                  </td>\r\n                  <td class=\"text-center\">\r\n                    <div class=\"form-check\">\r\n                      <label class=\"form-check-label\">\r\n                        <input class=\"form-check-input\" type=\"checkbox\">\r\n                        <span class=\"form-check-sign\"></span>\r\n                      </label>\r\n                    </div>\r\n                  </td>\r\n                  <td>\r\n                    Apple iPad\r\n                  </td>\r\n                  <td>\r\n                    Meeting\r\n                  </td>\r\n                  <td class=\"text-center\">\r\n                    10\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    € 499.00\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    € 4,990\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td class=\"text-center\">\r\n                    5\r\n                  </td>\r\n                  <td class=\"text-center\">\r\n                    <div class=\"form-check\">\r\n                      <label class=\"form-check-label\">\r\n                        <input class=\"form-check-input\" type=\"checkbox\" checked>\r\n                        <span class=\"form-check-sign\"></span>\r\n                      </label>\r\n                    </div>\r\n                  </td>\r\n                  <td>\r\n                    Apple iPhone\r\n                  </td>\r\n                  <td>\r\n                    Communication\r\n                  </td>\r\n                  <td class=\"text-center\">\r\n                    10\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    € 599.00\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    € 5,999\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td colspan=\"5\"></td>\r\n                  <td class=\"td-total\">Total</td>\r\n                  <td class=\"td-price\">€ 35,999</td>\r\n                </tr>\r\n              </tbody>\r\n            </table>\r\n          </div>\r\n        </div>\r\n      </div>\r\n    </div>\r\n    <div class=\"col-md-12\">\r\n      <div class=\"card\">\r\n        <div class=\"card-header\">\r\n          <h4 class=\"card-title\"> Shopping Cart Table</h4>\r\n        </div>\r\n        <div class=\"card-body\">\r\n          <div class=\"table-responsive\">\r\n            <table class=\"table table-shopping\">\r\n              <thead class=\"\">\r\n                <tr>\r\n                  <th class=\"text-center\"></th>\r\n                  <th>\r\n                    Product\r\n                  </th>\r\n                  <th></th>\r\n                  <th></th>\r\n                  <th class=\"text-right\">\r\n                    Price\r\n                  </th>\r\n                  <th class=\"text-right\">\r\n                    Qty\r\n                  </th>\r\n                  <th class=\"text-right\">\r\n                    Amount\r\n                  </th>\r\n                </tr>\r\n              </thead>\r\n              <tbody>\r\n                <tr>\r\n                  <td>\r\n                    <div class=\"img-container\">\r\n                      <img src=\"./assets/img/agenda.png\" alt=\"...\">\r\n                    </div>\r\n                  </td>\r\n                  <td class=\"td-name\">\r\n                    <a href=\"#notebook\">Get Shit Done Notebook</a>\r\n                    <br>\r\n                    <small>Most beautiful agenda for the office.</small>\r\n                  </td>\r\n                  <td>\r\n                  </td>\r\n                  <td>\r\n                  </td>\r\n                  <td class=\"td-number\">\r\n                    <small>€</small>3,390\r\n                  </td>\r\n                  <td class=\"td-number\">\r\n                    1\r\n                    <div class=\"btn-group btn-group-sm\">\r\n                      <button class=\"btn btn-outline-default btn-round\"> <i class=\"nc-icon nc-simple-delete\"></i> </button>\r\n                      <button class=\"btn btn-outline-default btn-round\"> <i class=\"nc-icon nc-simple-add\"></i> </button>\r\n                    </div>\r\n                  </td>\r\n                  <td class=\"td-number\">\r\n                    <small>€</small>549\r\n                  </td>\r\n                  <td class=\"td-actions\">\r\n                    <button type=\"button\" rel=\"tooltip\" data-placement=\"left\" title=\"\" class=\"btn btn-neutral\" data-original-title=\"Remove item\">\r\n                      <i class=\"nc-icon nc-simple-remove\"></i>\r\n                    </button>\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td>\r\n                    <div class=\"img-container\">\r\n                      <img src=\"./assets/img/stylus.jpg\" alt=\"...\">\r\n                    </div>\r\n                  </td>\r\n                  <td class=\"td-name\">\r\n                    <a href=\"#pen\">Stylus</a>\r\n                    <br>\r\n                    <small>Design is not just what it looks like and feels like. Design is how it works</small>\r\n                  </td>\r\n                  <td>\r\n                  </td>\r\n                  <td>\r\n                  </td>\r\n                  <td class=\"td-number\">\r\n                    <small>€</small>499\r\n                  </td>\r\n                  <td class=\"td-number\">\r\n                    2\r\n                    <div class=\"btn-group btn-group-sm\">\r\n                      <button class=\"btn btn-outline-default btn-round\"> <i class=\"nc-icon nc-simple-delete\"></i> </button>\r\n                      <button class=\"btn btn-outline-default btn-round\"> <i class=\"nc-icon nc-simple-add\"></i> </button>\r\n                    </div>\r\n                  </td>\r\n                  <td class=\"td-number\">\r\n                    <small>€</small>998\r\n                  </td>\r\n                  <td class=\"td-actions\">\r\n                    <button type=\"button\" rel=\"tooltip\" data-placement=\"left\" title=\"\" class=\"btn btn-neutral\" data-original-title=\"Remove item\">\r\n                      <i class=\"nc-icon nc-simple-remove\"></i>\r\n                    </button>\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td>\r\n                    <div class=\"img-container\">\r\n                      <img src=\"./assets/img/evernote.png\" alt=\"...\">\r\n                    </div>\r\n                  </td>\r\n                  <td class=\"td-name\">\r\n                    <a href=\"#agenda\">Evernote iPad Stander</a>\r\n                    <br>\r\n                    <small>A groundbreaking Retina display. All-flash architecture. Fourth-generation Intel processors.</small>\r\n                  </td>\r\n                  <td>\r\n                  </td>\r\n                  <td>\r\n                  </td>\r\n                  <td class=\"td-number\">\r\n                    <small>€</small>200\r\n                  </td>\r\n                  <td class=\"td-number\">\r\n                    1\r\n                    <div class=\"btn-group btn-group-sm\">\r\n                      <button class=\"btn btn-outline-default btn-round\"> <i class=\"nc-icon nc-simple-delete\"></i> </button>\r\n                      <button class=\"btn btn-outline-default btn-round\"> <i class=\"nc-icon nc-simple-add\"></i> </button>\r\n                    </div>\r\n                  </td>\r\n                  <td class=\"td-number\">\r\n                    <small>€</small>799\r\n                  </td>\r\n                  <td class=\"td-actions\">\r\n                    <button type=\"button\" rel=\"tooltip\" data-placement=\"left\" title=\"\" class=\"btn btn-neutral\" data-original-title=\"Remove item\">\r\n                      <i class=\"nc-icon nc-simple-remove\"></i>\r\n                    </button>\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td colspan=\"3\">\r\n                  </td>\r\n                  <td class=\"td-total\">\r\n                    Total\r\n                  </td>\r\n                  <td class=\"td-price\">\r\n                    <small>€</small>7,479\r\n                  </td>\r\n                  <td colspan=\"3\" class=\"text-right\">\r\n                    <button type=\"button\" rel=\"tooltip\" class=\"btn btn-outline-default btn-round \" data-original-title=\"\" title=\"\">\r\n                      Complete Purchase\r\n                      <i class=\"nc-icon nc-minimal-right\"></i>\r\n                    </button>\r\n                  </td>\r\n                </tr>\r\n              </tbody>\r\n            </table>\r\n          </div>\r\n        </div>\r\n      </div>\r\n    </div>\r\n  </div>\r\n</div>\r\n");

/***/ }),

/***/ "./node_modules/raw-loader/dist/cjs.js!./src/app/tables/regulartable/regulartable.component.html":
/*!*******************************************************************************************************!*\
  !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/tables/regulartable/regulartable.component.html ***!
  \*******************************************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("<div class=\"main-content\">\r\n  <div class=\"row\">\r\n    <div class=\"col-md-12\">\r\n      <div class=\"card\">\r\n        <div class=\"card-header\">\r\n          <h4 class=\"card-title\"> Simple Table</h4>\r\n        </div>\r\n        <div class=\"card-body\">\r\n          <div class=\"table-responsive\">\r\n            <table class=\"table\">\r\n              <thead class=\"\">\r\n                <th>\r\n                  Name\r\n                </th>\r\n                <th>\r\n                  Country\r\n                </th>\r\n                <th>\r\n                  City\r\n                </th>\r\n                <th class=\"text-right\">\r\n                  Salary\r\n                </th>\r\n              </thead>\r\n              <tbody>\r\n                <tr>\r\n                  <td>\r\n                    Dakota Rice\r\n                  </td>\r\n                  <td>\r\n                    Niger\r\n                  </td>\r\n                  <td>\r\n                    Oud-Turnhout\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    $36,738\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td>\r\n                    Minerva Hooper\r\n                  </td>\r\n                  <td>\r\n                    Curaçao\r\n                  </td>\r\n                  <td>\r\n                    Sinaai-Waas\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    $23,789\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td>\r\n                    Sage Rodriguez\r\n                  </td>\r\n                  <td>\r\n                    Netherlands\r\n                  </td>\r\n                  <td>\r\n                    Baileux\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    $56,142\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td>\r\n                    Philip Chaney\r\n                  </td>\r\n                  <td>\r\n                    Korea, South\r\n                  </td>\r\n                  <td>\r\n                    Overland Park\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    $38,735\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td>\r\n                    Doris Greene\r\n                  </td>\r\n                  <td>\r\n                    Malawi\r\n                  </td>\r\n                  <td>\r\n                    Feldkirchen in Kärnten\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    $63,542\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td>\r\n                    Mason Porter\r\n                  </td>\r\n                  <td>\r\n                    Chile\r\n                  </td>\r\n                  <td>\r\n                    Gloucester\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    $78,615\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td>\r\n                    Jon Porter\r\n                  </td>\r\n                  <td>\r\n                    Portugal\r\n                  </td>\r\n                  <td>\r\n                    Gloucester\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    $98,615\r\n                  </td>\r\n                </tr>\r\n              </tbody>\r\n            </table>\r\n          </div>\r\n        </div>\r\n      </div>\r\n    </div>\r\n    <div class=\"col-md-12\">\r\n      <div class=\"card card-plain\">\r\n        <div class=\"card-header\">\r\n          <h4 class=\"card-title\"> Table on Plain Background</h4>\r\n          <p class=\"card-category\"> Here is a subtitle for this table</p>\r\n        </div>\r\n        <div class=\"card-body\">\r\n          <div class=\"table-responsive\">\r\n            <table class=\"table\">\r\n              <thead class=\"\">\r\n                <th>\r\n                  Name\r\n                </th>\r\n                <th>\r\n                  Country\r\n                </th>\r\n                <th>\r\n                  City\r\n                </th>\r\n                <th class=\"text-right\">\r\n                  Salary\r\n                </th>\r\n              </thead>\r\n              <tbody>\r\n                <tr>\r\n                  <td>\r\n                    Dakota Rice\r\n                  </td>\r\n                  <td>\r\n                    Niger\r\n                  </td>\r\n                  <td>\r\n                    Oud-Turnhout\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    $36,738\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td>\r\n                    Minerva Hooper\r\n                  </td>\r\n                  <td>\r\n                    Curaçao\r\n                  </td>\r\n                  <td>\r\n                    Sinaai-Waas\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    $23,789\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td>\r\n                    Sage Rodriguez\r\n                  </td>\r\n                  <td>\r\n                    Netherlands\r\n                  </td>\r\n                  <td>\r\n                    Baileux\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    $56,142\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td>\r\n                    Philip Chaney\r\n                  </td>\r\n                  <td>\r\n                    Korea, South\r\n                  </td>\r\n                  <td>\r\n                    Overland Park\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    $38,735\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td>\r\n                    Doris Greene\r\n                  </td>\r\n                  <td>\r\n                    Malawi\r\n                  </td>\r\n                  <td>\r\n                    Feldkirchen in Kärnten\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    $63,542\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td>\r\n                    Mason Porter\r\n                  </td>\r\n                  <td>\r\n                    Chile\r\n                  </td>\r\n                  <td>\r\n                    Gloucester\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    $78,615\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td>\r\n                    Jon Porter\r\n                  </td>\r\n                  <td>\r\n                    Portugal\r\n                  </td>\r\n                  <td>\r\n                    Gloucester\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    $98,615\r\n                  </td>\r\n                </tr>\r\n              </tbody>\r\n            </table>\r\n          </div>\r\n        </div>\r\n      </div>\r\n    </div>\r\n    <div class=\"col-md-12\">\r\n      <div class=\"card\">\r\n        <div class=\"card-header\">\r\n          <h4 class=\"card-title\"> Regular Table with Colors</h4>\r\n        </div>\r\n        <div class=\"card-body table-full-width table-hover\">\r\n          <div class=\"table-responsive\">\r\n            <table class=\"table\">\r\n              <thead class=\"\">\r\n                <th>\r\n                  Name\r\n                </th>\r\n                <th>\r\n                  Country\r\n                </th>\r\n                <th>\r\n                  City\r\n                </th>\r\n                <th class=\"text-right\">\r\n                  Salary\r\n                </th>\r\n              </thead>\r\n              <tbody>\r\n                <tr class=\"table-success\">\r\n                  <td>\r\n                    Dakota Rice\r\n                  </td>\r\n                  <td>\r\n                    Niger\r\n                  </td>\r\n                  <td>\r\n                    Oud-Turnhout\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    $36,738\r\n                  </td>\r\n                </tr>\r\n                <tr class=\"\">\r\n                  <td>\r\n                    Minerva Hooper\r\n                  </td>\r\n                  <td>\r\n                    Curaçao\r\n                  </td>\r\n                  <td>\r\n                    Sinaai-Waas\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    $23,789\r\n                  </td>\r\n                </tr>\r\n                <tr class=\"table-info\">\r\n                  <td>\r\n                    Sage Rodriguez\r\n                  </td>\r\n                  <td>\r\n                    Netherlands\r\n                  </td>\r\n                  <td>\r\n                    Baileux\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    $56,142\r\n                  </td>\r\n                </tr>\r\n                <tr class=\"\">\r\n                  <td>\r\n                    Philip Chaney\r\n                  </td>\r\n                  <td>\r\n                    Korea, South\r\n                  </td>\r\n                  <td>\r\n                    Overland Park\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    $38,735\r\n                  </td>\r\n                </tr>\r\n                <tr class=\"table-danger\">\r\n                  <td>\r\n                    Doris Greene\r\n                  </td>\r\n                  <td>\r\n                    Malawi\r\n                  </td>\r\n                  <td>\r\n                    Feldkirchen in Kärnten\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    $63,542\r\n                  </td>\r\n                </tr>\r\n                <tr class=\"\">\r\n                  <td>\r\n                    Mason Porter\r\n                  </td>\r\n                  <td>\r\n                    Chile\r\n                  </td>\r\n                  <td>\r\n                    Gloucester\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    $78,615\r\n                  </td>\r\n                </tr>\r\n                <tr class=\"table-warning\">\r\n                  <td>\r\n                    Jon Porter\r\n                  </td>\r\n                  <td>\r\n                    Portugal\r\n                  </td>\r\n                  <td>\r\n                    Gloucester\r\n                  </td>\r\n                  <td class=\"text-right\">\r\n                    $98,615\r\n                  </td>\r\n                </tr>\r\n              </tbody>\r\n            </table>\r\n          </div>\r\n        </div>\r\n      </div>\r\n    </div>\r\n  </div>\r\n</div>\r\n");

/***/ }),

/***/ "./src/app/tables/datatable.net/datatable.component.ts":
/*!*************************************************************!*\
  !*** ./src/app/tables/datatable.net/datatable.component.ts ***!
  \*************************************************************/
/*! exports provided: DataTableComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "DataTableComponent", function() { return DataTableComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/__ivy_ngcc__/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __importDefault = (undefined && undefined.__importDefault) || function (mod) {
  return (mod && mod.__esModule) ? mod : { "default": mod };
};

var DataTableComponent = /** @class */ (function () {
    function DataTableComponent() {
    }
    DataTableComponent.prototype.ngOnInit = function () {
        this.dataTable = {
            headerRow: ['Name', 'Position', 'Office', 'Age', 'Date', 'Actions'],
            footerRow: ['Name', 'Position', 'Office', 'Age', 'Start Date', 'Actions'],
            dataRows: [
                ['Airi Satou', 'Andrew Mike', 'Develop', '2013', '99,225', ''],
                ['Angelica Ramos', 'John Doe', 'Design', '2012', '89,241', 'btn-round'],
                ['Ashton Cox', 'Alex Mike', 'Design', '2010', '92,144', 'btn-simple'],
                ['Bradley Greer', 'Mike Monday', 'Marketing', '2013', '49,990', 'btn-round'],
                ['Brenden Wagner', 'Paul Dickens', 'Communication', '2015', '69,201', ''],
                ['Brielle Williamson', 'Mike Monday', 'Marketing', '2013', '49,990', 'btn-round'],
                ['Caesar Vance', 'Mike Monday', 'Marketing', '2013', '49,990', 'btn-round'],
                ['Cedric Kelly', 'Mike Monday', 'Marketing', '2013', '49,990', 'btn-round'],
                ['Charde Marshall', 'Mike Monday', 'Marketing', '2013', '49,990', 'btn-round'],
                ['Colleen Hurst', 'Mike Monday', 'Marketing', '2013', '49,990', 'btn-round'],
                ['Dai Rios', 'Andrew Mike', 'Develop', '2013', '99,225', ''],
                ['Doris Wilder', 'John Doe', 'Design', '2012', '89,241', 'btn-round'],
                ['Fiona Green', 'Alex Mike', 'Design', '2010', '92,144', 'btn-simple'],
                ['Garrett Winters', 'Mike Monday', 'Marketing', '2013', '49,990', 'btn-round'],
                ['Gavin Cortez', 'Paul Dickens', 'Communication', '2015', '69,201', ''],
                ['Gavin Joyce', 'Mike Monday', 'Marketing', '2013', '49,990', 'btn-round'],
                ['Gloria Little', 'Mike Monday', 'Marketing', '2013', '49,990', 'btn-round'],
                ['Haley Kennedy', 'Mike Monday', 'Marketing', '2013', '49,990', 'btn-round'],
                ['Herrod Chandler', 'Mike Monday', 'Marketing', '2013', '49,990', 'btn-round'],
                ['Hope Fuentes', 'Mike Monday', 'Marketing', '2013', '49,990', 'btn-round'],
                ['Howard Hatfield', 'Andrew Mike', 'Develop', '2013', '99,225', ''],
                ['Jena Gaines', 'John Doe', 'Design', '2012', '89,241', 'btn-round'],
                ['Jenette Caldwell', 'Alex Mike', 'Design', '2010', '92,144', 'btn-simple'],
                ['Jennifer Chang', 'Mike Monday', 'Marketing', '2013', '49,990', 'btn-round'],
                ['Martena Mccray', 'Paul Dickens', 'Communication', '2015', '69,201', ''],
                ['Michael Silva', 'Mike Monday', 'Marketing', '2013', '49,990', 'btn-round'],
                ['Michelle House', 'Mike Monday', 'Marketing', '2013', '49,990', 'btn-round'],
                ['Paul Byrd', 'Mike Monday', 'Marketing', '2013', '49,990', 'btn-round'],
                ['Prescott Bartlett', 'Mike Monday', 'Marketing', '2013', '49,990', 'btn-round'],
                ['Quinn Flynn', 'Mike Monday', 'Marketing', '2013', '49,990', 'btn-round'],
                ['Rhona Davidson', 'Andrew Mike', 'Develop', '2013', '99,225', ''],
                ['Shou Itou', 'John Doe', 'Design', '2012', '89,241', 'btn-round'],
                ['Sonya Frost', 'Alex Mike', 'Design', '2010', '92,144', 'btn-simple'],
                ['Suki Burks', 'Mike Monday', 'Marketing', '2013', '49,990', 'btn-round'],
                ['Tatyana Fitzpatrick', 'Paul Dickens', 'Communication', '2015', '69,201', ''],
                ['Tiger Nixon', 'Mike Monday', 'Marketing', '2013', '49,990', 'btn-round'],
                ['Timothy Mooney', 'Mike Monday', 'Marketing', '2013', '49,990', 'btn-round'],
                ['Unity Butler', 'Mike Monday', 'Marketing', '2013', '49,990', 'btn-round'],
                ['Vivian Harrell', 'Mike Monday', 'Marketing', '2013', '49,990', 'btn-round'],
                ['Yuri Berry', 'Mike Monday', 'Marketing', '2013', '49,990', 'btn-round']
            ]
        };
    };
    DataTableComponent.prototype.ngAfterViewInit = function () {
        $('#datatable').DataTable({
            "pagingType": "full_numbers",
            "lengthMenu": [
                [10, 25, 50, -1],
                [10, 25, 50, "All"]
            ],
            responsive: true,
            language: {
                search: "_INPUT_",
                searchPlaceholder: "Search records",
            }
        });
        var table = $('#datatable').DataTable();
        // Edit record
        table.on('click', '.edit', function () {
            var $tr = $(this).closest('tr');
            var data = table.row($tr).data();
            alert('You press on Row: ' + data[0] + ' ' + data[1] + ' ' + data[2] + '\'s row.');
        });
        // Delete a record
        table.on('click', '.remove', function (e) {
            var $tr = $(this).closest('tr');
            table.row($tr).remove().draw();
            e.preventDefault();
        });
        //Like record
        table.on('click', '.like', function () {
            alert('You clicked on Like button');
        });
    };
    DataTableComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'data-table-cmp',
            template: __importDefault(__webpack_require__(/*! raw-loader!./datatable.component.html */ "./node_modules/raw-loader/dist/cjs.js!./src/app/tables/datatable.net/datatable.component.html")).default
        })
    ], DataTableComponent);
    return DataTableComponent;
}());



/***/ }),

/***/ "./src/app/tables/extendedtable/extendedtable.component.ts":
/*!*****************************************************************!*\
  !*** ./src/app/tables/extendedtable/extendedtable.component.ts ***!
  \*****************************************************************/
/*! exports provided: ExtendedTableComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ExtendedTableComponent", function() { return ExtendedTableComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/__ivy_ngcc__/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __importDefault = (undefined && undefined.__importDefault) || function (mod) {
  return (mod && mod.__esModule) ? mod : { "default": mod };
};

var ExtendedTableComponent = /** @class */ (function () {
    function ExtendedTableComponent() {
    }
    ExtendedTableComponent.prototype.ngOnInit = function () {
    };
    ExtendedTableComponent.prototype.ngAfterViewInit = function () {
        // Init Tooltips
        $('[rel="tooltip"]').tooltip();
    };
    ExtendedTableComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'extended-table-cmp',
            template: __importDefault(__webpack_require__(/*! raw-loader!./extendedtable.component.html */ "./node_modules/raw-loader/dist/cjs.js!./src/app/tables/extendedtable/extendedtable.component.html")).default
        })
    ], ExtendedTableComponent);
    return ExtendedTableComponent;
}());



/***/ }),

/***/ "./src/app/tables/regulartable/regulartable.component.ts":
/*!***************************************************************!*\
  !*** ./src/app/tables/regulartable/regulartable.component.ts ***!
  \***************************************************************/
/*! exports provided: RegularTableComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "RegularTableComponent", function() { return RegularTableComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/__ivy_ngcc__/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __importDefault = (undefined && undefined.__importDefault) || function (mod) {
  return (mod && mod.__esModule) ? mod : { "default": mod };
};

var RegularTableComponent = /** @class */ (function () {
    function RegularTableComponent() {
    }
    RegularTableComponent.prototype.ngOnInit = function () {
        this.tableData1 = {
            headerRow: ['ID', 'Name', 'Country', 'City', 'Salary'],
            dataRows: [
                ['1', 'Dakota Rice', 'Niger', 'Oud-Turnhout', '$36,738'],
                ['2', 'Minerva Hooper', 'Curaçao', 'Sinaai-Waas', '$23,789'],
                ['3', 'Sage Rodriguez', 'Netherlands', 'Baileux', '$56,142'],
                ['4', 'Philip Chaney', 'Korea, South', 'Overland Park', '$38,735'],
                ['5', 'Doris Greene', 'Malawi', 'Feldkirchen in Kärnten', '$63,542'],
                ['6', 'Mason Porter', 'Chile', 'Gloucester', '$78,615']
            ]
        };
        this.tableData2 = {
            headerRow: ['ID', 'Name', 'Salary', 'Country', 'City'],
            dataRows: [
                ['1', 'Dakota Rice', '$36,738', 'Niger', 'Oud-Turnhout'],
                ['2', 'Minerva Hooper', '$23,789', 'Curaçao', 'Sinaai-Waas'],
                ['3', 'Sage Rodriguez', '$56,142', 'Netherlands', 'Baileux'],
                ['4', 'Philip Chaney', '$38,735', 'Korea, South', 'Overland Park'],
                ['5', 'Doris Greene', '$63,542', 'Malawi', 'Feldkirchen in Kärnten',],
                ['6', 'Mason Porter', '$78,615', 'Chile', 'Gloucester']
            ]
        };
        this.tableData3 = {
            headerRow: ['ID', 'Name', 'Salary', 'Country', 'City'],
            dataRows: [
                ['1', 'Dakota Rice (Success)', '$36,738', 'Niger', 'Oud-Turnhout'],
                ['2', 'Minerva Hooper', '$23,789', 'Curaçao', 'Sinaai-Waas'],
                ['3', 'Sage Rodriguez (Info)', '$56,142', 'Netherlands', 'Baileux'],
                ['4', 'Philip Chaney', '$38,735', 'Korea, South', 'Overland Park'],
                ['5', 'Doris Greene (Danger)', '$63,542', 'Malawi', 'Feldkirchen in Kärnten',],
                ['6', 'Mason Porter', '$78,615', 'Chile', 'Gloucester'],
                ['7', 'Mike Chaney (Warning)', '$38,735', 'Romania', 'Bucharest']
            ]
        };
    };
    RegularTableComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'regular-table-cmp',
            template: __importDefault(__webpack_require__(/*! raw-loader!./regulartable.component.html */ "./node_modules/raw-loader/dist/cjs.js!./src/app/tables/regulartable/regulartable.component.html")).default
        })
    ], RegularTableComponent);
    return RegularTableComponent;
}());



/***/ }),

/***/ "./src/app/tables/tables.module.ts":
/*!*****************************************!*\
  !*** ./src/app/tables/tables.module.ts ***!
  \*****************************************/
/*! exports provided: TablesModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "TablesModule", function() { return TablesModule; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/__ivy_ngcc__/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/__ivy_ngcc__/fesm5/router.js");
/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common */ "./node_modules/@angular/common/__ivy_ngcc__/fesm5/common.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/__ivy_ngcc__/fesm5/forms.js");
/* harmony import */ var _tables_routing__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./tables.routing */ "./src/app/tables/tables.routing.ts");
/* harmony import */ var _extendedtable_extendedtable_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./extendedtable/extendedtable.component */ "./src/app/tables/extendedtable/extendedtable.component.ts");
/* harmony import */ var _regulartable_regulartable_component__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./regulartable/regulartable.component */ "./src/app/tables/regulartable/regulartable.component.ts");
/* harmony import */ var _datatable_net_datatable_component__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./datatable.net/datatable.component */ "./src/app/tables/datatable.net/datatable.component.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __importDefault = (undefined && undefined.__importDefault) || function (mod) {
  return (mod && mod.__esModule) ? mod : { "default": mod };
};








var TablesModule = /** @class */ (function () {
    function TablesModule() {
    }
    TablesModule = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["NgModule"])({
            imports: [
                _angular_common__WEBPACK_IMPORTED_MODULE_2__["CommonModule"],
                _angular_router__WEBPACK_IMPORTED_MODULE_1__["RouterModule"].forChild(_tables_routing__WEBPACK_IMPORTED_MODULE_4__["TablesRoutes"]),
                _angular_forms__WEBPACK_IMPORTED_MODULE_3__["FormsModule"]
            ],
            declarations: [
                _extendedtable_extendedtable_component__WEBPACK_IMPORTED_MODULE_5__["ExtendedTableComponent"],
                _datatable_net_datatable_component__WEBPACK_IMPORTED_MODULE_7__["DataTableComponent"],
                _regulartable_regulartable_component__WEBPACK_IMPORTED_MODULE_6__["RegularTableComponent"]
            ]
        })
    ], TablesModule);
    return TablesModule;
}());



/***/ }),

/***/ "./src/app/tables/tables.routing.ts":
/*!******************************************!*\
  !*** ./src/app/tables/tables.routing.ts ***!
  \******************************************/
/*! exports provided: TablesRoutes */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "TablesRoutes", function() { return TablesRoutes; });
/* harmony import */ var _extendedtable_extendedtable_component__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! ./extendedtable/extendedtable.component */ "./src/app/tables/extendedtable/extendedtable.component.ts");
/* harmony import */ var _regulartable_regulartable_component__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ./regulartable/regulartable.component */ "./src/app/tables/regulartable/regulartable.component.ts");
/* harmony import */ var _datatable_net_datatable_component__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./datatable.net/datatable.component */ "./src/app/tables/datatable.net/datatable.component.ts");
var __importDefault = (undefined && undefined.__importDefault) || function (mod) {
  return (mod && mod.__esModule) ? mod : { "default": mod };
};



var TablesRoutes = [{
        path: '',
        children: [{
                path: 'regular',
                component: _regulartable_regulartable_component__WEBPACK_IMPORTED_MODULE_1__["RegularTableComponent"]
            }]
    }, {
        path: '',
        children: [{
                path: 'extended',
                component: _extendedtable_extendedtable_component__WEBPACK_IMPORTED_MODULE_0__["ExtendedTableComponent"]
            }]
    }, {
        path: '',
        children: [{
                path: 'datatables.net',
                component: _datatable_net_datatable_component__WEBPACK_IMPORTED_MODULE_2__["DataTableComponent"]
            }]
    }
];


/***/ })

}]);
//# sourceMappingURL=tables-tables-module.js.map