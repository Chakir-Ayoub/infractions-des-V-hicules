package com.example.demo.web;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dto.InfractionsDTO;
import com.example.demo.entity.Infractions;
import com.example.demo.mapper.InfractionsMapper;
import com.example.demo.repository.InfractionsRepository;
import com.example.demo.service.InfractionsService;
import com.example.demo.stub.InfractionServiceGrpc.InfractionServiceImplBase;
import com.example.demo.stub.InfractionServiceOuterClass;
import com.example.demo.stub.InfractionServiceOuterClass.GetAllInfractionsRequest;
import com.example.demo.stub.InfractionServiceOuterClass.GetInfractionByIdRequest;
import com.example.demo.stub.InfractionServiceOuterClass.GetInfractionByIdResponse;
import com.example.demo.stub.InfractionServiceOuterClass.GetInfractionsResponse;
import com.example.demo.stub.InfractionServiceOuterClass.SaveInfractionRequest;
import com.example.demo.stub.InfractionServiceOuterClass.SaveInfractionResponse;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class InfractionGrpcController extends InfractionServiceImplBase{
	@Autowired
	private InfractionsService infractionsService;
	@Autowired
	private InfractionsMapper infractionsMapper;
	@Autowired
	private InfractionsRepository infractionsRepository;
	
	@Override
	public void getAllInfraction(GetAllInfractionsRequest request,
			StreamObserver<GetInfractionsResponse> responseObserver) {
		// TODO Auto-generated method stub
	
			List<Infractions> infractions =infractionsRepository.findAll();

			
			List<InfractionServiceOuterClass.Infraction> grpcInfractions=
					infractions.stream()
								.map(infractionsMapper::fromInfractionEntity).collect(Collectors.toList());
			
			InfractionServiceOuterClass.GetInfractionsResponse getInfractionsResponse=
				InfractionServiceOuterClass.GetInfractionsResponse.newBuilder()
							.addAllInfractions(grpcInfractions)
							.build();
			
			responseObserver.onNext(getInfractionsResponse);
			responseObserver.onCompleted();
	}
	
	@Override
	public void getInfractionById(GetInfractionByIdRequest request,
			StreamObserver<GetInfractionByIdResponse> responseObserver) {
		// TODO Auto-generated method stub
		InfractionsDTO infractions=infractionsService.GetById(request.getId());
		
		InfractionServiceOuterClass.GetInfractionByIdResponse response=
		InfractionServiceOuterClass.GetInfractionByIdResponse.newBuilder()
					.setInfraction(infractionsMapper.fromInfractionResponse(infractions))
  					.build();
		
		responseObserver.onNext(response);
		responseObserver.onCompleted();
		
	}
	
	@Override
	public void saveInfraction(SaveInfractionRequest request, StreamObserver<SaveInfractionResponse> responseObserver) {
		// TODO Auto-generated method stub
		InfractionServiceOuterClass.InfractionRequest infractionRequest=request.getInfraction();
		
		Infractions infractions=infractionsMapper.fromInfractionRequest(infractionRequest);
		
		Infractions savedInfraction=infractionsRepository.save(infractions);
		
		InfractionServiceOuterClass.SaveInfractionResponse response=
				InfractionServiceOuterClass.SaveInfractionResponse.newBuilder()
							.setInfraction(infractionsMapper.fromInfractionEntity(savedInfraction))
		  					.build();
		
		responseObserver.onNext(response);
		responseObserver.onCompleted();
		
	}
	
	
}
