import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './component/dashboard/dashboard.component';
import { DepartmentComponent } from './department/department.component';
//import { FeedbackComponent } from './feedback/feedback.component';
import { ViewPatientComponent } from './view-patient/view-patient.component';

const routes: Routes = [
  { path: '', pathMatch:'full', redirectTo:'dashboard'},
  { path:'dashboard', component:DashboardComponent},
  { path:'view', component:ViewPatientComponent},
  { path:'department', component:DepartmentComponent},
  //{ path:'feedback', component:FeedbackComponent}//

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [DashboardComponent, ViewPatientComponent,DepartmentComponent]
