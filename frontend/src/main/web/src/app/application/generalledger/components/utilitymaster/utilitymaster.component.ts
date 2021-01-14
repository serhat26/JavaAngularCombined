import { Component, OnInit } from "@angular/core";

declare const $: any;

@Component({
  selector: "general-period",
  templateUrl: "./utilitymaster.component.html",
  styles: [
    `
      .navbar-light .navbar-nav .nav-link {
        color: rgba(0, 0, 0, 0.5) !important;
      }

      .table-responsive {
        display: block;
        width: 100%;
        overflow: auto !important;
        -webkit-overflow-scrolling: touch;
      }
    `,
  ],
})
export class UtilityMaster implements OnInit {
  public ngOnInit() {}
}
