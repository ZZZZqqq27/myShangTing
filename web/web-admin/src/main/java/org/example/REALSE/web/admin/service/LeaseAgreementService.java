package org.example.REALSE.web.admin.service;

import org.example.REALSE.model.entity.LeaseAgreement;
import org.example.REALSE.web.admin.vo.agreement.AgreementQueryVo;
import org.example.REALSE.web.admin.vo.agreement.AgreementVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author liubo
* @description 针对表【lease_agreement(租约信息表)】的数据库操作Service
* @createDate 2023-07-24 15:48:00
*/
public interface LeaseAgreementService extends IService<LeaseAgreement> {

}
