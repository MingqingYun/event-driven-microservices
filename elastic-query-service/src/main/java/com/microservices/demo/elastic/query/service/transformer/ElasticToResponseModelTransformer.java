package com.microservices.demo.elastic.query.service.transformer;

import com.microservices.demo.elastic.model.index.impl.TwitterIndexModel;
import com.microservices.demo.elastic.query.service.model.ElasticQueryServiceResponseModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ElasticToResponseModelTransformer {
    public ElasticQueryServiceResponseModel getResponseModel(TwitterIndexModel twitterIndexModel) {
        return ElasticQueryServiceResponseModel.builder()
                .id(twitterIndexModel.getId())
                .text(twitterIndexModel.getText())
                .createdAt(twitterIndexModel.getCreatedAt())
                .userId(twitterIndexModel.getUserId())
                .build();

    };

    public List<ElasticQueryServiceResponseModel> getResponseModels(List<TwitterIndexModel> twitterIndexModels){
         return twitterIndexModels.stream().map(this::getResponseModel).collect(Collectors.toList());

    }
}
