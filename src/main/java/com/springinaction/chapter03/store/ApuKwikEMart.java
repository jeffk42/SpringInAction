package com.springinaction.chapter03.store;

public class ApuKwikEMart implements KwikEMart {
	
	private boolean squisheeMachineEmpty;

	@Override
	public Squishee buySquishee(Customer customer) throws KwikEMartException {
		if (customer.isBroke())
			throw new CustomerIsBrokeException();
		
		if (squisheeMachineEmpty)
			throw new NoMoreSquisheesException();
		
		
		System.out.println("Here's your Squishee!");
		
		return new Squishee();
	}

	/**
	 * @return the squisheeMachineEmpty
	 */
	public boolean isSquisheeMachineEmpty() {
		return squisheeMachineEmpty;
	}

	/**
	 * @param squisheeMachineEmpty the squisheeMachineEmpty to set
	 */
	public void setSquisheeMachineEmpty(boolean squisheeMachineEmpty) {
		this.squisheeMachineEmpty = squisheeMachineEmpty;
	}

	
}
