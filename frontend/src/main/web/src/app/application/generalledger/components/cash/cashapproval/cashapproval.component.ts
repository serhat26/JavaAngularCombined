import { Component, OnInit } from "@angular/core";
declare const $: any;

@Component({
  selector: "general-journalvoucher",
  templateUrl: "./cashapproval.component.html",
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
export class CashApproval implements OnInit {
  numbers = [];
  show: boolean = false;
  constructor() {
    this.numbers = new Array(30).fill(0).map((x, i) => i);
  }
  public ngOnInit() {}
  showJV() {
    this.show = !this.show;
  }
}
