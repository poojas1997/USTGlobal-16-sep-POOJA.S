import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { AddbookComponent } from './addbook/addbook.component';
import { SearchBookComponent } from './search-book/search-book.component';
import { AuthGuard } from './auth.guard';
import { GetallbookComponent } from './getallbook/getallbook.component';
import { IssueComponent } from './issue/issue.component';
import { ViewRequestComponent } from './view-request/view-request.component';


const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'login', component: LoginComponent },
  { path: 'addbook' , component: AddbookComponent} ,
  { path: 'searchbook' , component: SearchBookComponent},
  { path: 'getall' , component: GetallbookComponent},
  { path: 'issue' , component: IssueComponent},
  { path: 'request' , component: ViewRequestComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
