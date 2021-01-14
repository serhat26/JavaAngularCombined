(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["timeline-timeline-module"],{

/***/ "./node_modules/raw-loader/dist/cjs.js!./src/app/timeline/timeline.component.html":
/*!****************************************************************************************!*\
  !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/timeline/timeline.component.html ***!
  \****************************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("<div class=\"main-content\">\r\n  <div class=\"header text-center\">\r\n    <h3 class=\"title\">Timeline</h3>\r\n  </div>\r\n  <div class=\"row\">\r\n    <div class=\"col-md-12\">\r\n      <div class=\"card card-timeline card-plain\">\r\n        <div class=\"card-body\">\r\n          <ul class=\"timeline\">\r\n            <li class=\"timeline-inverted\">\r\n              <div class=\"timeline-badge danger\">\r\n                <i class=\"nc-icon nc-single-copy-04\"></i>\r\n              </div>\r\n              <div class=\"timeline-panel\">\r\n                <div class=\"timeline-heading\">\r\n                  <span class=\"badge badge-pill badge-danger\">Some Title</span>\r\n                </div>\r\n                <div class=\"timeline-body\">\r\n                  <p>Wifey made the best Father's Day meal ever. So thankful so happy so blessed. Thank you for making my family We just had fun with the “future” theme !!! It was a fun night all together ... The always rude Kanye Show at 2am Sold Out Famous viewing @ Figueroa and 12th in downtown.</p>\r\n                </div>\r\n                <h6>\r\n                  <i class=\"fa fa-clock-o\"></i> 11 hours ago via Twitter\r\n                </h6>\r\n              </div>\r\n            </li>\r\n            <li>\r\n              <div class=\"timeline-badge success\">\r\n                <i class=\"nc-icon nc-sun-fog-29\"></i>\r\n              </div>\r\n              <div class=\"timeline-panel\">\r\n                <div class=\"timeline-heading\">\r\n                  <span class=\"badge badge-pill badge-success\">Another One</span>\r\n                </div>\r\n                <div class=\"timeline-body\">\r\n                  <p>Thank God for the support of my wife and real friends. I also wanted to point out that it’s the first album to go number 1 off of streaming!!! I love you Ellen and also my number one design rule of anything I do from shoes to music to homes is that Kim has to like it....</p>\r\n                </div>\r\n              </div>\r\n            </li>\r\n            <li class=\"timeline-inverted\">\r\n              <div class=\"timeline-badge info\">\r\n                <i class=\"nc-icon nc-world-2\"></i>\r\n              </div>\r\n              <div class=\"timeline-panel\">\r\n                <div class=\"timeline-heading\">\r\n                  <span class=\"badge badge-pill badge-info\">Another Title</span>\r\n                </div>\r\n                <div class=\"timeline-body\">\r\n                  <p>Called I Miss the Old Kanye That’s all it was Kanye And I love you like Kanye loves Kanye Famous viewing @ Figueroa and 12th in downtown LA 11:10PM</p>\r\n                  <p>What if Kanye made a song about Kanye Royère doesn't make a Polar bear bed but the Polar bear couch is my favorite piece of furniture we own It wasn’t any Kanyes Set on his goals Kanye</p>\r\n                  <hr>\r\n                </div>\r\n                <div class=\"timeline-footer\">\r\n                  <div class=\"dropdown\">\r\n                    <button type=\"button\" class=\"btn btn-round btn-info dropdown-toggle\" data-toggle=\"dropdown\">\r\n                      <i class=\"nc-icon nc-settings-gear-65\"></i>\r\n                    </button>\r\n                    <div class=\"dropdown-menu\">\r\n                      <a class=\"dropdown-item\" href=\"javascript:void(0)\">Action</a>\r\n                      <a class=\"dropdown-item\" href=\"javascript:void(0)\">Another action</a>\r\n                      <a class=\"dropdown-item\" href=\"javascript:void(0)\">Something else here</a>\r\n                    </div>\r\n                  </div>\r\n                </div>\r\n              </div>\r\n            </li>\r\n            <li>\r\n              <div class=\"timeline-badge warning\">\r\n                <i class=\"nc-icon nc-istanbul\"></i>\r\n              </div>\r\n              <div class=\"timeline-panel\">\r\n                <div class=\"timeline-heading\">\r\n                  <span class=\"badge badge-pill badge-warning\">Another One</span>\r\n                </div>\r\n                <div class=\"timeline-body\">\r\n                  <p>Tune into Big Boy's 92.3 I'm about to play the first single from Cruel Winter also to Kim’s hair and makeup Lorraine jewelry and the whole style squad at Balmain and the Yeezy team. Thank you Anna for the invite thank you to the whole Vogue team</p>\r\n                </div>\r\n              </div>\r\n            </li>\r\n          </ul>\r\n        </div>\r\n      </div>\r\n    </div>\r\n  </div>\r\n</div>\r\n");

/***/ }),

/***/ "./src/app/timeline/timeline.component.ts":
/*!************************************************!*\
  !*** ./src/app/timeline/timeline.component.ts ***!
  \************************************************/
/*! exports provided: TimelineComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "TimelineComponent", function() { return TimelineComponent; });
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

var TimelineComponent = /** @class */ (function () {
    function TimelineComponent() {
    }
    TimelineComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'timeline-cmp',
            template: __importDefault(__webpack_require__(/*! raw-loader!./timeline.component.html */ "./node_modules/raw-loader/dist/cjs.js!./src/app/timeline/timeline.component.html")).default
        })
    ], TimelineComponent);
    return TimelineComponent;
}());



/***/ }),

/***/ "./src/app/timeline/timeline.module.ts":
/*!*********************************************!*\
  !*** ./src/app/timeline/timeline.module.ts ***!
  \*********************************************/
/*! exports provided: TimelineModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "TimelineModule", function() { return TimelineModule; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/__ivy_ngcc__/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/__ivy_ngcc__/fesm5/router.js");
/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common */ "./node_modules/@angular/common/__ivy_ngcc__/fesm5/common.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/__ivy_ngcc__/fesm5/forms.js");
/* harmony import */ var _timeline_component__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./timeline.component */ "./src/app/timeline/timeline.component.ts");
/* harmony import */ var _timeline_routing__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./timeline.routing */ "./src/app/timeline/timeline.routing.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __importDefault = (undefined && undefined.__importDefault) || function (mod) {
  return (mod && mod.__esModule) ? mod : { "default": mod };
};






var TimelineModule = /** @class */ (function () {
    function TimelineModule() {
    }
    TimelineModule = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["NgModule"])({
            imports: [
                _angular_common__WEBPACK_IMPORTED_MODULE_2__["CommonModule"],
                _angular_router__WEBPACK_IMPORTED_MODULE_1__["RouterModule"].forChild(_timeline_routing__WEBPACK_IMPORTED_MODULE_5__["TimelineRoutes"]),
                _angular_forms__WEBPACK_IMPORTED_MODULE_3__["FormsModule"]
            ],
            declarations: [_timeline_component__WEBPACK_IMPORTED_MODULE_4__["TimelineComponent"]]
        })
    ], TimelineModule);
    return TimelineModule;
}());



/***/ }),

/***/ "./src/app/timeline/timeline.routing.ts":
/*!**********************************************!*\
  !*** ./src/app/timeline/timeline.routing.ts ***!
  \**********************************************/
/*! exports provided: TimelineRoutes */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "TimelineRoutes", function() { return TimelineRoutes; });
/* harmony import */ var _timeline_component__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! ./timeline.component */ "./src/app/timeline/timeline.component.ts");
var __importDefault = (undefined && undefined.__importDefault) || function (mod) {
  return (mod && mod.__esModule) ? mod : { "default": mod };
};

var TimelineRoutes = [{
        path: '',
        children: [{
                path: 'pages/timeline',
                component: _timeline_component__WEBPACK_IMPORTED_MODULE_0__["TimelineComponent"]
            }]
    }];


/***/ })

}]);
//# sourceMappingURL=timeline-timeline-module.js.map