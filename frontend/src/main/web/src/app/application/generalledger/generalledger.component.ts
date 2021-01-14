import { Component, OnInit } from "@angular/core";

declare const $: any;

@Component({
  selector: "application-general",
  templateUrl: "./generalledger.component.html",
  styleUrls: ["./generalledger.component.css"],
})
export class GeneralLedger implements OnInit {
  show: boolean = false;

  public ngOnInit() {}
  myFunc() {
    this.show = !this.show;
  }
}
