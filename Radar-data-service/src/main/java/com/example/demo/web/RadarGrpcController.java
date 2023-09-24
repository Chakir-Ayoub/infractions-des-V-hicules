package com.example.demo.web;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.dto.RadarDTO;
import com.example.demo.mapper.RadarMapper;
import com.example.demo.service.RadarService;
import com.example.demo.stub.RadarServiceGrpc.RadarServiceImplBase;
import com.example.demo.stub.RadarServiceOuterClass;
import com.example.demo.stub.RadarServiceOuterClass.GetAllRadarsRequest;
import com.example.demo.stub.RadarServiceOuterClass.GetRadarsResponse;
import com.example.demo.stub.RadarServiceOuterClass.SaveRadarRequest;
import com.example.demo.stub.RadarServiceOuterClass.SaveRadarResponse;
import com.example.response.RadarResponse;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class RadarGrpcController extends RadarServiceImplBase {
	
	@Autowired
	private RadarService  radarService;
	@Autowired
	private RadarMapper radarMapper;
	
	@Override
	public void getAllRadars(GetAllRadarsRequest request, StreamObserver<GetRadarsResponse> responseObserver) {
		// TODO Auto-generated method stub
		List<RadarDTO> radarDTO=radarService.GetAll();
		List<RadarResponse> radarResponses=new ArrayList<>();
		
		for (RadarDTO radarDto2 : radarDTO) {
			radarResponses.add(radarMapper.fromRadarDtoTOresponse(radarDto2));
		}
		
		List<RadarServiceOuterClass.Radar> grpcRadars=
				radarResponses.stream()
						.map(radarMapper::fromRadarResponse).collect(Collectors.toList());
		
		RadarServiceOuterClass.GetRadarsResponse getRadarsResponse=
			 RadarServiceOuterClass.GetRadarsResponse.newBuilder()
			 	   .addAllRadars(grpcRadars)
			 	   .build();
		
		responseObserver.onNext(getRadarsResponse);
		responseObserver.onCompleted();
		
	}
	
	@Override
	public void saveRadar(SaveRadarRequest request, StreamObserver<SaveRadarResponse> responseObserver) {
		// TODO Auto-generated method stub
		
	}

}
