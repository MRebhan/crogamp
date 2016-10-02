package com.github.mrebhan.crogamp;

import com.github.mrebhan.crogamp.cli.CrogampCLI;

public class Crogamp {

	public static final String VERSION = "0.1.0 PR";

	public static void main(String[] args) {
		ICrogampInterface ica = new CrogampCLI();

		ica.start(args);
	}

}
