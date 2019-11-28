package com.ustglobal.custamizedcheckedexception;

public class ValidateAmount {

	void checkAmount(int Amount) throws InvalidAmountException {
		if(Amount > 40000) {
			throw new InvalidAmountException();
		}
	}
}
