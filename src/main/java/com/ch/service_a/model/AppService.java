package com.ch.service_a.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppService {
    private String _id;
    @Field("service_id")
    private String serviceId;
    @Field("service_name")
    private String serviceName;
}
