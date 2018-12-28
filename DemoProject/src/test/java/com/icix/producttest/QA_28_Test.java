package com.icix.producttest;

import org.testng.annotations.Test;

import com.icix.functionality.TwoActorRequestLogics;

public class QA_28_Test {

	@Test
	public void OpenRequestPage() throws Exception
	{
		TwoActorRequestLogics.openReqPage();
	}
}
