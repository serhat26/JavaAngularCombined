(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["application-application-module"],{

/***/ "./src/app/application/application.component.ts":
/*!******************************************************!*\
  !*** ./src/app/application/application.component.ts ***!
  \******************************************************/
/*! exports provided: ApplicationComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ApplicationComponent", function() { return ApplicationComponent; });
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

var ApplicationComponent = /** @class */ (function () {
    function ApplicationComponent() {
    }
    ApplicationComponent.prototype.ngOnInit = function () { };
    ApplicationComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: "application-app",
            styles: ["\n      .navbar-light .navbar-nav .nav-link {\n        color: rgba(0, 0, 0, 0.5) !important;\n      }\n\n      .table-responsive {\n        display: block;\n        width: 100%;\n        overflow: auto !important;\n        -webkit-overflow-scrolling: touch;\n      }\n    "]
        })
    ], ApplicationComponent);
    return ApplicationComponent;
}());



/***/ }),

/***/ "./src/app/application/application.module.ts":
/*!***************************************************!*\
  !*** ./src/app/application/application.module.ts ***!
  \***************************************************/
/*! exports provided: ApplicationModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ApplicationModule", function() { return ApplicationModule; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/__ivy_ngcc__/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/__ivy_ngcc__/fesm5/router.js");
/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common */ "./node_modules/@angular/common/__ivy_ngcc__/fesm5/common.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/__ivy_ngcc__/fesm5/forms.js");
/* harmony import */ var _application_routing__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./application.routing */ "./src/app/application/application.routing.ts");
/* harmony import */ var _application_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./application.component */ "./src/app/application/application.component.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __importDefault = (undefined && undefined.__importDefault) || function (mod) {
  return (mod && mod.__esModule) ? mod : { "default": mod };
};






var ApplicationModule = /** @class */ (function () {
    function ApplicationModule() {
    }
    ApplicationModule = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["NgModule"])({
            imports: [
                _angular_common__WEBPACK_IMPORTED_MODULE_2__["CommonModule"],
                _angular_router__WEBPACK_IMPORTED_MODULE_1__["RouterModule"].forChild(_application_routing__WEBPACK_IMPORTED_MODULE_4__["ApplicationRoutes"]),
                _angular_forms__WEBPACK_IMPORTED_MODULE_3__["FormsModule"],
            ],
            declarations: [_application_component__WEBPACK_IMPORTED_MODULE_5__["ApplicationComponent"]],
        })
    ], ApplicationModule);
    return ApplicationModule;
}());



/***/ }),

/***/ "./src/app/application/application.routing.ts":
/*!****************************************************!*\
  !*** ./src/app/application/application.routing.ts ***!
  \****************************************************/
/*! exports provided: ApplicationRoutes */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ApplicationRoutes", function() { return ApplicationRoutes; });
/* harmony import */ var _generalledger_generalledger_component__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! ./generalledger/generalledger.component */ "./src/app/application/generalledger/generalledger.component.ts");
var __importDefault = (undefined && undefined.__importDefault) || function (mod) {
  return (mod && mod.__esModule) ? mod : { "default": mod };
};

var ApplicationRoutes = [
    {
        path: "",
        children: [
            {
                path: "generalledger",
                component: _generalledger_generalledger_component__WEBPACK_IMPORTED_MODULE_0__["GeneralLedger"],
                children: [
                    {
                        path: "",
                        loadChildren: "./generalledger/generalledger.module#GeneralLedgerModule",
                    },
                ],
            },
        ],
    },
];


/***/ })

}]);
//# sourceMappingURL=application-application-module.js.map