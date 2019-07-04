package lk.abms.sl.abms_site_manager.repository;

import lk.abms.sl.abms_site_manager.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Worker,String> {
    Worker findByNic(String nic) throws Exception;
}
