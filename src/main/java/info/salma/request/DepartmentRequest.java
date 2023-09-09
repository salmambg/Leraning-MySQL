package info.salma.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentRequest {
    @NotNull
    private String departmentName;

    @NotNull
    private String departmentAddress;

    @NotNull
    private String departmentCode;
}
