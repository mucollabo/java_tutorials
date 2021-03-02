package SamePackage;

import OtherPackage.*;

class SameClassChecker {
	public SameClassChecker() {
		this._public();
		this._protected();
		this._default();
		this._private();
	}
	
	public void _public() {
		System.out.println("public");
	}
	
	protected void _protected() {
		System.out.println("protected");
	}
	
	void _default() {
		System.out.println("default");
	}
	
	private void _private() {
		System.out.println("private");
	}
}

class SamePackageChecker extends Same {
	public SamePackageChecker() {
		Same same = new Same();
		same._public();
		same._protected();
		same._default();
//		same._private();
		
		this._public();
		this._protected();
		this._default();
		this._private();
	}
}

class OtherPackageChecker extends Other {
	public OtherPackageChecker() {
		Other other = new Other();
		other._public();
//		other._protected();
//		other._default();
//		other._private();
		
		this._public();
		this._protected();
//		this._default();
//		this._private();
		
		Nothing nothing = new Nothing();
		nothing._public();
//		nothing._protected();
//		nothing._default();
//		nothing._private();
	}
}
