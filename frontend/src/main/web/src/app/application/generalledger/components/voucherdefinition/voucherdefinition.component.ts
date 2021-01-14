import { Component, OnInit } from "@angular/core";
import { CommonModule } from "@angular/common";

declare const $: any;

@Component({
  selector: "general-voucherdefinition",
  templateUrl: "./voucherdefinition.component.html",
  styles: [
    `
      .navbar a:not(.btn):not(.dropdown-item) {
        color: black !important;
      }
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
export class VoucherDefinition implements OnInit {
  public ngOnInit() {}
  voucher: boolean = true;
  period: boolean = false;
  Voucher() {
    this.voucher = true;
    this.period = false;
  }
  Period() {
    this.voucher = false;
    this.period = true;
  }
}
