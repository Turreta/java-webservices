package com.karlsangabriel.ws;

import javax.jws.WebService;

import com.karlsangabriel.ws.dto.AdditionRequest;
import com.karlsangabriel.ws.dto.SumResponse;

@WebService(name = "AdditionWS")
public interface AdditionWS {

	SumResponse add(AdditionRequest additionRequest);
}
