import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { TechComponent } from './tech/tech.component';
import { RouterModule } from '@angular/router';
import { CarParentComponent } from './car-parent/car-parent.component';
import { CarChildComponent } from './car-child/car-child.component';
import { BikeParentComponent } from './bike-parent/bike-parent.component';
import { BikeChildComponent } from './bike-child/bike-child.component';
import { MoviesParentComponent } from './movies-parent/movies-parent.component';
import { MoviesChildComponent } from './movies-child/movies-child.component';
import { LaptopParentComponent } from './laptop-parent/laptop-parent.component';
import { LaptopChildComponent } from './laptop-child/laptop-child.component';
import { MobileParentComponent } from './mobile-parent/mobile-parent.component';
import { MobileChildComponent } from './mobile-child/mobile-child.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    TechComponent,
    CarParentComponent,
    CarChildComponent,
    BikeParentComponent,
    BikeChildComponent,
    MoviesParentComponent,
    MoviesChildComponent,
    LaptopParentComponent,
    LaptopChildComponent,
    MobileParentComponent,
    MobileChildComponent,
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path : 'tech' , component : TechComponent},
      {path : 'car' , component : CarParentComponent},
      {path : 'bike' , component : BikeParentComponent},
      {path : 'movie' , component : MoviesParentComponent},
      {path : 'laps' , component : LaptopParentComponent},
      {path : 'mobile' , component : MobileParentComponent},
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
