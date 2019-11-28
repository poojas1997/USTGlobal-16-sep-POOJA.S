import { ElementRef, Directive, HostBinding, HostListener } from '@angular/core';




@Directive({
    selector : '[custdir]'
})



export class CustomDirective {
    constructor(private el: ElementRef) {
        this.el.nativeElement.style.backgroundColor = 'red';
    }

    @HostBinding('style.backgroundColor') backgroundColor = 'yellow';
    @HostListener('mouseenter') enter() {
        this.el.nativeElement.style.backgroundColor = 'brown';
}

    @HostListener('mouseleave') leave() {
        this.el.nativeElement.style.backgroundColor = 'blue';
    }


}