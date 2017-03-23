/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.processplatform.core.entity.content;

import com.x.base.core.entity.SliceJpaObject_;
import com.x.processplatform.core.entity.element.ActivityType;
import com.x.processplatform.core.entity.element.ManualMode;
import java.lang.Boolean;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.processplatform.core.entity.content.Task.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Fri Mar 10 10:10:19 CST 2017")
public class Task_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<Task,String> activity;
    public static volatile SingularAttribute<Task,String> activityName;
    public static volatile SingularAttribute<Task,String> activityToken;
    public static volatile SingularAttribute<Task,ActivityType> activityType;
    public static volatile SingularAttribute<Task,Boolean> allowRapid;
    public static volatile SingularAttribute<Task,String> application;
    public static volatile SingularAttribute<Task,String> applicationAlias;
    public static volatile SingularAttribute<Task,String> applicationName;
    public static volatile SingularAttribute<Task,String> company;
    public static volatile SingularAttribute<Task,Date> createTime;
    public static volatile SingularAttribute<Task,String> creatorCompany;
    public static volatile SingularAttribute<Task,String> creatorDepartment;
    public static volatile SingularAttribute<Task,String> creatorIdentity;
    public static volatile SingularAttribute<Task,String> creatorPerson;
    public static volatile SingularAttribute<Task,String> department;
    public static volatile SingularAttribute<Task,Date> expireTime;
    public static volatile SingularAttribute<Task,String> id;
    public static volatile SingularAttribute<Task,String> identity;
    public static volatile SingularAttribute<Task,String> job;
    public static volatile SingularAttribute<Task,ManualMode> manualMode;
    public static volatile SingularAttribute<Task,Boolean> modified;
    public static volatile SingularAttribute<Task,String> opinion;
    public static volatile SingularAttribute<Task,String> person;
    public static volatile SingularAttribute<Task,String> process;
    public static volatile SingularAttribute<Task,String> processAlias;
    public static volatile SingularAttribute<Task,String> processName;
    public static volatile ListAttribute<Task,String> routeList;
    public static volatile SingularAttribute<Task,String> routeName;
    public static volatile ListAttribute<Task,String> routeNameList;
    public static volatile SingularAttribute<Task,String> sequence;
    public static volatile SingularAttribute<Task,String> serial;
    public static volatile SingularAttribute<Task,Date> startTime;
    public static volatile SingularAttribute<Task,String> startTimeMonth;
    public static volatile SingularAttribute<Task,String> title;
    public static volatile SingularAttribute<Task,Date> updateTime;
    public static volatile SingularAttribute<Task,Boolean> viewed;
    public static volatile SingularAttribute<Task,String> work;
}