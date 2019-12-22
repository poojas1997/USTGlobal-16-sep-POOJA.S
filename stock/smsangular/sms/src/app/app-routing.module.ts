import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddComponent } from './add/add.component';
import { ModifyComponent } from './modify/modify.component';
import { SearchComponent } from './search/search.component';
import { GetallComponent } from './getall/getall.component';



const routes: Routes = [

  {
    path: 'add', component: AddComponent
  },
  {path : 'modify' , component : ModifyComponent},
  {path: 'search' , component : SearchComponent},
  {path: 'get', component : GetallComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
