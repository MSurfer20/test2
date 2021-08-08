package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-08T21:15:36.024879Z[Etc/UTC]")
@Controller
@RequestMapping("${openapi.zulipREST.base-path:/api/v1}")
public class StreamsApiController implements StreamsApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public StreamsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
