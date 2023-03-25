package com.sh.numble.mybox.mapstruct;

import com.sh.numble.mybox.dto.FileDto;
import com.sh.numble.mybox.entity.File;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(
    componentModel = "spring",
    unmappedTargetPolicy = ReportingPolicy.IGNORE,
    nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface FileMapper extends GenericMapper<FileDto, File> {
}
