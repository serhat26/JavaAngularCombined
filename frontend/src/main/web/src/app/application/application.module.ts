import { NgModule } from "@angular/core";
import { RouterModule } from "@angular/router";
import { CommonModule } from "@angular/common";
import { FormsModule } from "@angular/forms";
import { ApplicationRoutes } from "./application.routing";
import { ApplicationComponent } from "./application.component";
@NgModule({
  imports: [
    CommonModule,
    RouterModule.forChild(ApplicationRoutes),
    FormsModule,
  ],
  declarations: [ApplicationComponent],
})
export class ApplicationModule {}
