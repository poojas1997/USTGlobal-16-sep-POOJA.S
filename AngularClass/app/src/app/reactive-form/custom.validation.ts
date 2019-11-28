import { AbstractControl, ValidationErrors } from '@angular/forms';








export class CustomValidation {
    constructor() {}
    static Unique(control: AbstractControl): ValidationErrors | null {
        if (control.value === 'john@gmail.com') {
            return {Unique : true};
        } else {
            return null;
        }
    }

}
