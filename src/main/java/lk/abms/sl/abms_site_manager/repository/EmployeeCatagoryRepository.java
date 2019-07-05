package lk.abms.sl.abms_site_manager.repository;

import lk.abms.sl.abms_site_manager.entity.WorkerCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeCatagoryRepository extends JpaRepository<WorkerCategory,String> {

    WorkerCategory findByEmpCatId(String empCatId);
}
