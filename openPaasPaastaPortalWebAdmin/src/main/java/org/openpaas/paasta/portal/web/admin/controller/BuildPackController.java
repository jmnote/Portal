package org.openpaas.paasta.portal.web.admin.controller;

import org.openpaas.paasta.portal.web.admin.common.Common;
import org.openpaas.paasta.portal.web.admin.model.BuildPack;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * 빌드팩 컨트롤러 - 빌드팩 정보를 조회, 수정한다.
 *
 * @author 조민구
 * @version 1.0
 * @since 2016.4.4 최초작성
 */
@Controller
public class BuildPackController extends Common {

    //private static final Logger LOGGER = LoggerFactory.getLogger(BuildPackController.class);

    /**
     * 빌드팩 화면
     *
     * @return model and view
     */
    @RequestMapping(value = {"/buildPack/buildPackMain"}, method = RequestMethod.GET)
    public ModelAndView webIdeUser() {
        ModelAndView mv = new ModelAndView();

        mv.setViewName("buildPack/buildPackMain");

        return mv;
    }


    /**
     * 빌드팩 조회
     *
     * @param buildPack the buildPack
     * @return String rspApp
     */
    @RequestMapping(value = {"/buildPack/getBuildPacks"}, method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getBuildPacks(@RequestBody BuildPack buildPack) {

        return commonService.procRestTemplate("/buildPack/getBuildPacks", HttpMethod.POST, buildPack, getToken());

    }

    /**
     * 빌드팩 정보 수정
     *
     * @param buildPack the buildPack
     * @return String rspApp
     */
    @RequestMapping(value = {"/buildPack/updateBuildPack"}, method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> updateBuildPack(@RequestBody BuildPack buildPack) {

        return commonService.procRestTemplate("/buildPack/updateBuildPack", HttpMethod.POST, buildPack, getToken());
    }


}
