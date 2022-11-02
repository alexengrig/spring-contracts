package dev.alexengrig.sample.spring.contract.rest.producer.dto.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProducerDataResponseV2 {

    private String id;
    private String value;

}
