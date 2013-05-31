/**
This file is automatically generated.  Do not modify
*/
package org.kairosdb.datastore.h2.orm;

import java.util.Locale;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.sql.Timestamp;
import org.xml.sax.ContentHandler;
import org.xml.sax.Attributes;
import genorm.runtime.*;


/**
*/
public class DeleteMetricsQuery extends genorm.runtime.SQLQuery
	{
	private static final Logger s_logger = LoggerFactory.getLogger(DeleteMetricsQuery.class.getName());
	
	public static final String QUERY_NAME = "delete_metrics";
	public static final String QUERY = "delete from data_point this\n				where\n				this.\"metric_id\" = ?\n				and this.\"timestamp\" >= ?\n				and this.\"timestamp\" <= ?";
	private static final int ATTRIBUTE_COUNT = 0;
	private static Map<String, Integer> s_attributeIndex;
	private static String[] s_attributeNames = {
 };
			
	static
		{
		s_attributeIndex = new HashMap<String, Integer>();
		for (int I = 0; I < ATTRIBUTE_COUNT; I++)
			s_attributeIndex.put(s_attributeNames[I], I);
		}
	
	private boolean m_serializable;
	
	private String m_metricId;
	private java.sql.Timestamp m_startTime;
	private java.sql.Timestamp m_endTime;

	//Deprecated
	public DeleteMetricsQuery()
		{
		super();
		}		
	//---------------------------------------------------------------------------
	public DeleteMetricsQuery(String metricId, java.sql.Timestamp startTime, java.sql.Timestamp endTime)
		{
		super();
		m_metricId = metricId;
		m_startTime = startTime;
		m_endTime = endTime;
		}
		
	//---------------------------------------------------------------------------
	public String getQueryName() { return (QUERY_NAME); }
	
	//---------------------------------------------------------------------------
	public String getQuery() { return (QUERY); }
		
	//---------------------------------------------------------------------------
	public void setSerializable(boolean serializable)
		{
		m_serializable = serializable;
		}
	
	//---------------------------------------------------------------------------
	public String toString()
		{
		StringBuilder sb = new StringBuilder();
		sb.append(this.getClass().getName());
		sb.append(" metricId=").append(String.valueOf(m_metricId));
		sb.append(" startTime=").append(String.valueOf(m_startTime));
		sb.append(" endTime=").append(String.valueOf(m_endTime));
		
		return (sb.toString());
		}
		
	
	//---------------------------------------------------------------------------
	//Deprecated
	public int runUpdate(String metricId, java.sql.Timestamp startTime, java.sql.Timestamp endTime)
		{
		int ret = 0;
		java.sql.PreparedStatement genorm_statement = null;
		
		try
			{
			String genorm_query = QUERY;
			
			genorm_statement = org.kairosdb.datastore.h2.orm.GenOrmDataSource.prepareStatement(genorm_query);
			genorm_statement.setString(1, metricId);
			genorm_statement.setTimestamp(2, startTime);
			genorm_statement.setTimestamp(3, endTime);

			
			ret = genorm_statement.executeUpdate();
			}
		catch (java.sql.SQLException sqle)
			{
			throw new GenOrmException(sqle);
			}
		finally
			{
			try
				{
				if (genorm_statement != null)
					genorm_statement.close();
				}
			catch (java.sql.SQLException sqle2) { }
			}
			
		return (ret);
		}	
	//---------------------------------------------------------------------------
	public int runUpdate()
		{
		int ret = 0;
		java.sql.PreparedStatement genorm_statement = null;
		try
			{
			String genorm_query = QUERY;
			
			genorm_statement = org.kairosdb.datastore.h2.orm.GenOrmDataSource.prepareStatement(genorm_query);
			genorm_statement.setString(1, m_metricId);
			genorm_statement.setTimestamp(2, m_startTime);
			genorm_statement.setTimestamp(3, m_endTime);

			
			ret = genorm_statement.executeUpdate();
			}
		catch (java.sql.SQLException sqle)
			{
			throw new GenOrmException(sqle);
			}
		finally
			{
			try
				{
				genorm_statement.close();
				}
			catch (java.sql.SQLException sqle2) { }
			}
			
		return (ret);
		}
	}