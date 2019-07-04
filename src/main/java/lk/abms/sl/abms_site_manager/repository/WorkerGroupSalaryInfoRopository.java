package lk.abms.sl.abms_site_manager.repository;

import lk.abms.sl.abms_site_manager.entity.WorkerGroupSalaryInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface WorkerGroupSalaryInfoRopository extends JpaRepository<WorkerGroupSalaryInfo,String> {
    Optional<WorkerGroupSalaryInfo> findById(String id);
}
