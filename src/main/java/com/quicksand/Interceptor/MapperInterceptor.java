package com.quicksand.Interceptor;

import java.util.Properties;

import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;

public class MapperInterceptor implements Interceptor{

	 private final static String _sql_regex = ".*MapperGD.*";
	    
	    @SuppressWarnings("unchecked")
	    private void processIntercept(final Object[] queryArgs) {
	      final MappedStatement ms = (MappedStatement) queryArgs[0];
	      final Object parameter = queryArgs[1];
	      String mapperSQL = ms.getBoundSql(parameter).getSql();
	      BoundSql boundSQL = ms.getBoundSql(parameter);
	      System.out.println(ms.getResource());
	      
	      /*Class<?> entityclazz = MappedStatmentHelper.getEntityClazz(ms.getResource());
	      queryArgs[0] = MappedStatmentHelper.setMSReturnSetMap(ms, entityclazz);
	      
	      boolean interceptor = mapperSQL.matches(_sql_regex);
	      if(!interceptor){
	        return;
	      }
	      if(entityclazz == null){
	        throw new RuntimeException("使用公共dao必須給mapper接口的@MyBatisRepository(User.class) 注解設置值.");
	      }
	      
	      String new_sql = MapperSqlHelper.getExecuSQL(entityclazz,mapperSQL,parameter);
	      
	      BoundSql newBoundSql = MappedStatmentHelper.copyFromBoundSql(ms,
	          boundSQL, new_sql);
	      MappedStatement newMs = MappedStatmentHelper
	          .copyFromMappedStatement(ms, newBoundSql);
	      queryArgs[0] = newMs;*/
	    }
	public Object intercept(Invocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	public Object plugin(Object target) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setProperties(Properties properties) {
		// TODO Auto-generated method stub
		
	}
	
}
