package com.karlsangabriel.ws;

import com.karlsangabriel.ws.dto.AdditionRequest;
import com.karlsangabriel.ws.dto.SumResponse;

public class AdditionWSImpl implements AdditionWS {

	@Override
	public SumResponse add(AdditionRequest additionRequest) {
		
		int sum = additionRequest.getAdden1() + additionRequest.getAdden2();
		SumResponse response = new SumResponse();
		response.setSum(sum);
		
		return response;
	}

}
