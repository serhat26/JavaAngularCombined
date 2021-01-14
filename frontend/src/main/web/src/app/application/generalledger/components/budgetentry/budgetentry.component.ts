import { Component, OnInit } from "@angular/core";

declare const $: any;

@Component({
  selector: "application-budgetentry",
  templateUrl: "./budgetentry.component.html",
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
      .dropdown-submenu {
        position: relative;
      }

      .dropdown-submenu a::after {
        transform: rotate(-90deg);
        position: absolute;
        right: 6px;
        top: 0.8em;
      }

      .dropdown-submenu .dropdown-menu {
        top: 0;
        left: 100%;
        margin-left: 0.1rem;
        margin-right: 0.1rem;
      }
    `,
  ],
})
export class BudgetEntry implements OnInit {
  public ngOnInit() {}
}
