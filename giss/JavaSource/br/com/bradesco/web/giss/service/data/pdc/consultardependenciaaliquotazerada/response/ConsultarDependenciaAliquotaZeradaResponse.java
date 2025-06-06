/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ConsultarDependenciaAliquotaZeradaResponse.java,v 1.4 2018/04/24 02:26:47 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ConsultarDependenciaAliquotaZeradaResponse.
 * 
 * @version $Revision: 1.4 $ $Date: 2018/04/24 02:26:47 $
 */
public class ConsultarDependenciaAliquotaZeradaResponse implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codMensagem
     */
    private java.lang.String _codMensagem;

    /**
     * Field _mensagem
     */
    private java.lang.String _mensagem;

    /**
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _descMunicipio
     */
    private java.lang.String _descMunicipio;

    /**
     * Field _codUF
     */
    private java.lang.String _codUF;

    /**
     * Field _descUF
     */
    private java.lang.String _descUF;

    /**
     * Field _sinalApuracaoTotal
     */
    private java.lang.String _sinalApuracaoTotal;

    /**
     * Field _valorApuracaoTotal
     */
    private java.math.BigDecimal _valorApuracaoTotal = new java.math.BigDecimal("0");

    /**
     * Field _qtdeAgencia
     */
    private long _qtdeAgencia = 0;

    /**
     * keeps track of state for field: _qtdeAgencia
     */
    private boolean _has_qtdeAgencia;

    /**
     * Field _qtdePa
     */
    private long _qtdePa = 0;

    /**
     * keeps track of state for field: _qtdePa
     */
    private boolean _has_qtdePa;

    /**
     * Field _qtdeRegistros
     */
    private int _qtdeRegistros = 0;

    /**
     * keeps track of state for field: _qtdeRegistros
     */
    private boolean _has_qtdeRegistros;

    /**
     * Field _ocorrenciasDepAliquotaZList
     */
    private java.util.Vector _ocorrenciasDepAliquotaZList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarDependenciaAliquotaZeradaResponse() 
     {
        super();
        setValorApuracaoTotal(new java.math.BigDecimal("0"));
        _ocorrenciasDepAliquotaZList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.ConsultarDependenciaAliquotaZeradaResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOcorrenciasDepAliquotaZ
     * 
     * 
     * 
     * @param vOcorrenciasDepAliquotaZ
     */
    public void addOcorrenciasDepAliquotaZ(br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.OcorrenciasDepAliquotaZ vOcorrenciasDepAliquotaZ)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasDepAliquotaZList.addElement(vOcorrenciasDepAliquotaZ);
    } //-- void addOcorrenciasDepAliquotaZ(br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.OcorrenciasDepAliquotaZ) 

    /**
     * Method addOcorrenciasDepAliquotaZ
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasDepAliquotaZ
     */
    public void addOcorrenciasDepAliquotaZ(int index, br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.OcorrenciasDepAliquotaZ vOcorrenciasDepAliquotaZ)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasDepAliquotaZList.insertElementAt(vOcorrenciasDepAliquotaZ, index);
    } //-- void addOcorrenciasDepAliquotaZ(int, br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.OcorrenciasDepAliquotaZ) 

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteQtdeAgencia
     * 
     */
    public void deleteQtdeAgencia()
    {
        this._has_qtdeAgencia= false;
    } //-- void deleteQtdeAgencia() 

    /**
     * Method deleteQtdePa
     * 
     */
    public void deleteQtdePa()
    {
        this._has_qtdePa= false;
    } //-- void deleteQtdePa() 

    /**
     * Method deleteQtdeRegistros
     * 
     */
    public void deleteQtdeRegistros()
    {
        this._has_qtdeRegistros= false;
    } //-- void deleteQtdeRegistros() 

    /**
     * Method enumerateOcorrenciasDepAliquotaZ
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateOcorrenciasDepAliquotaZ()
    {
        return _ocorrenciasDepAliquotaZList.elements();
    } //-- java.util.Enumeration enumerateOcorrenciasDepAliquotaZ() 

    /**
     * Returns the value of field 'codMensagem'.
     * 
     * @return String
     * @return the value of field 'codMensagem'.
     */
    public java.lang.String getCodMensagem()
    {
        return this._codMensagem;
    } //-- java.lang.String getCodMensagem() 

    /**
     * Returns the value of field 'codMunicipio'.
     * 
     * @return long
     * @return the value of field 'codMunicipio'.
     */
    public long getCodMunicipio()
    {
        return this._codMunicipio;
    } //-- long getCodMunicipio() 

    /**
     * Returns the value of field 'codUF'.
     * 
     * @return String
     * @return the value of field 'codUF'.
     */
    public java.lang.String getCodUF()
    {
        return this._codUF;
    } //-- java.lang.String getCodUF() 

    /**
     * Returns the value of field 'descMunicipio'.
     * 
     * @return String
     * @return the value of field 'descMunicipio'.
     */
    public java.lang.String getDescMunicipio()
    {
        return this._descMunicipio;
    } //-- java.lang.String getDescMunicipio() 

    /**
     * Returns the value of field 'descUF'.
     * 
     * @return String
     * @return the value of field 'descUF'.
     */
    public java.lang.String getDescUF()
    {
        return this._descUF;
    } //-- java.lang.String getDescUF() 

    /**
     * Returns the value of field 'mensagem'.
     * 
     * @return String
     * @return the value of field 'mensagem'.
     */
    public java.lang.String getMensagem()
    {
        return this._mensagem;
    } //-- java.lang.String getMensagem() 

    /**
     * Method getOcorrenciasDepAliquotaZ
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasDepAliquotaZ
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.OcorrenciasDepAliquotaZ getOcorrenciasDepAliquotaZ(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasDepAliquotaZList.size())) {
            throw new IndexOutOfBoundsException("getOcorrenciasDepAliquotaZ: Index value '"+index+"' not in range [0.."+(_ocorrenciasDepAliquotaZList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.OcorrenciasDepAliquotaZ) _ocorrenciasDepAliquotaZList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.OcorrenciasDepAliquotaZ getOcorrenciasDepAliquotaZ(int) 

    /**
     * Method getOcorrenciasDepAliquotaZ
     * 
     * 
     * 
     * @return OcorrenciasDepAliquotaZ
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.OcorrenciasDepAliquotaZ[] getOcorrenciasDepAliquotaZ()
    {
        int size = _ocorrenciasDepAliquotaZList.size();
        br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.OcorrenciasDepAliquotaZ[] mArray = new br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.OcorrenciasDepAliquotaZ[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.OcorrenciasDepAliquotaZ) _ocorrenciasDepAliquotaZList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.OcorrenciasDepAliquotaZ[] getOcorrenciasDepAliquotaZ() 

    /**
     * Method getOcorrenciasDepAliquotaZCount
     * 
     * 
     * 
     * @return int
     */
    public int getOcorrenciasDepAliquotaZCount()
    {
        return _ocorrenciasDepAliquotaZList.size();
    } //-- int getOcorrenciasDepAliquotaZCount() 

    /**
     * Returns the value of field 'qtdeAgencia'.
     * 
     * @return long
     * @return the value of field 'qtdeAgencia'.
     */
    public long getQtdeAgencia()
    {
        return this._qtdeAgencia;
    } //-- long getQtdeAgencia() 

    /**
     * Returns the value of field 'qtdePa'.
     * 
     * @return long
     * @return the value of field 'qtdePa'.
     */
    public long getQtdePa()
    {
        return this._qtdePa;
    } //-- long getQtdePa() 

    /**
     * Returns the value of field 'qtdeRegistros'.
     * 
     * @return int
     * @return the value of field 'qtdeRegistros'.
     */
    public int getQtdeRegistros()
    {
        return this._qtdeRegistros;
    } //-- int getQtdeRegistros() 

    /**
     * Returns the value of field 'sinalApuracaoTotal'.
     * 
     * @return String
     * @return the value of field 'sinalApuracaoTotal'.
     */
    public java.lang.String getSinalApuracaoTotal()
    {
        return this._sinalApuracaoTotal;
    } //-- java.lang.String getSinalApuracaoTotal() 

    /**
     * Returns the value of field 'valorApuracaoTotal'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorApuracaoTotal'.
     */
    public java.math.BigDecimal getValorApuracaoTotal()
    {
        return this._valorApuracaoTotal;
    } //-- java.math.BigDecimal getValorApuracaoTotal() 

    /**
     * Method hasCodMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodMunicipio()
    {
        return this._has_codMunicipio;
    } //-- boolean hasCodMunicipio() 

    /**
     * Method hasQtdeAgencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeAgencia()
    {
        return this._has_qtdeAgencia;
    } //-- boolean hasQtdeAgencia() 

    /**
     * Method hasQtdePa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdePa()
    {
        return this._has_qtdePa;
    } //-- boolean hasQtdePa() 

    /**
     * Method hasQtdeRegistros
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeRegistros()
    {
        return this._has_qtdeRegistros;
    } //-- boolean hasQtdeRegistros() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Method removeAllOcorrenciasDepAliquotaZ
     * 
     */
    public void removeAllOcorrenciasDepAliquotaZ()
    {
        _ocorrenciasDepAliquotaZList.removeAllElements();
    } //-- void removeAllOcorrenciasDepAliquotaZ() 

    /**
     * Method removeOcorrenciasDepAliquotaZ
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasDepAliquotaZ
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.OcorrenciasDepAliquotaZ removeOcorrenciasDepAliquotaZ(int index)
    {
        java.lang.Object obj = _ocorrenciasDepAliquotaZList.elementAt(index);
        _ocorrenciasDepAliquotaZList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.OcorrenciasDepAliquotaZ) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.OcorrenciasDepAliquotaZ removeOcorrenciasDepAliquotaZ(int) 

    /**
     * Sets the value of field 'codMensagem'.
     * 
     * @param codMensagem the value of field 'codMensagem'.
     */
    public void setCodMensagem(java.lang.String codMensagem)
    {
        this._codMensagem = codMensagem;
    } //-- void setCodMensagem(java.lang.String) 

    /**
     * Sets the value of field 'codMunicipio'.
     * 
     * @param codMunicipio the value of field 'codMunicipio'.
     */
    public void setCodMunicipio(long codMunicipio)
    {
        this._codMunicipio = codMunicipio;
        this._has_codMunicipio = true;
    } //-- void setCodMunicipio(long) 

    /**
     * Sets the value of field 'codUF'.
     * 
     * @param codUF the value of field 'codUF'.
     */
    public void setCodUF(java.lang.String codUF)
    {
        this._codUF = codUF;
    } //-- void setCodUF(java.lang.String) 

    /**
     * Sets the value of field 'descMunicipio'.
     * 
     * @param descMunicipio the value of field 'descMunicipio'.
     */
    public void setDescMunicipio(java.lang.String descMunicipio)
    {
        this._descMunicipio = descMunicipio;
    } //-- void setDescMunicipio(java.lang.String) 

    /**
     * Sets the value of field 'descUF'.
     * 
     * @param descUF the value of field 'descUF'.
     */
    public void setDescUF(java.lang.String descUF)
    {
        this._descUF = descUF;
    } //-- void setDescUF(java.lang.String) 

    /**
     * Sets the value of field 'mensagem'.
     * 
     * @param mensagem the value of field 'mensagem'.
     */
    public void setMensagem(java.lang.String mensagem)
    {
        this._mensagem = mensagem;
    } //-- void setMensagem(java.lang.String) 

    /**
     * Method setOcorrenciasDepAliquotaZ
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasDepAliquotaZ
     */
    public void setOcorrenciasDepAliquotaZ(int index, br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.OcorrenciasDepAliquotaZ vOcorrenciasDepAliquotaZ)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasDepAliquotaZList.size())) {
            throw new IndexOutOfBoundsException("setOcorrenciasDepAliquotaZ: Index value '"+index+"' not in range [0.." + (_ocorrenciasDepAliquotaZList.size() - 1) + "]");
        }
        _ocorrenciasDepAliquotaZList.setElementAt(vOcorrenciasDepAliquotaZ, index);
    } //-- void setOcorrenciasDepAliquotaZ(int, br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.OcorrenciasDepAliquotaZ) 

    /**
     * Method setOcorrenciasDepAliquotaZ
     * 
     * 
     * 
     * @param ocorrenciasDepAliquotaZArray
     */
    public void setOcorrenciasDepAliquotaZ(br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.OcorrenciasDepAliquotaZ[] ocorrenciasDepAliquotaZArray)
    {
        //-- copy array
        _ocorrenciasDepAliquotaZList.removeAllElements();
        for (int i = 0; i < ocorrenciasDepAliquotaZArray.length; i++) {
            _ocorrenciasDepAliquotaZList.addElement(ocorrenciasDepAliquotaZArray[i]);
        }
    } //-- void setOcorrenciasDepAliquotaZ(br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.OcorrenciasDepAliquotaZ) 

    /**
     * Sets the value of field 'qtdeAgencia'.
     * 
     * @param qtdeAgencia the value of field 'qtdeAgencia'.
     */
    public void setQtdeAgencia(long qtdeAgencia)
    {
        this._qtdeAgencia = qtdeAgencia;
        this._has_qtdeAgencia = true;
    } //-- void setQtdeAgencia(long) 

    /**
     * Sets the value of field 'qtdePa'.
     * 
     * @param qtdePa the value of field 'qtdePa'.
     */
    public void setQtdePa(long qtdePa)
    {
        this._qtdePa = qtdePa;
        this._has_qtdePa = true;
    } //-- void setQtdePa(long) 

    /**
     * Sets the value of field 'qtdeRegistros'.
     * 
     * @param qtdeRegistros the value of field 'qtdeRegistros'.
     */
    public void setQtdeRegistros(int qtdeRegistros)
    {
        this._qtdeRegistros = qtdeRegistros;
        this._has_qtdeRegistros = true;
    } //-- void setQtdeRegistros(int) 

    /**
     * Sets the value of field 'sinalApuracaoTotal'.
     * 
     * @param sinalApuracaoTotal the value of field
     * 'sinalApuracaoTotal'.
     */
    public void setSinalApuracaoTotal(java.lang.String sinalApuracaoTotal)
    {
        this._sinalApuracaoTotal = sinalApuracaoTotal;
    } //-- void setSinalApuracaoTotal(java.lang.String) 

    /**
     * Sets the value of field 'valorApuracaoTotal'.
     * 
     * @param valorApuracaoTotal the value of field
     * 'valorApuracaoTotal'.
     */
    public void setValorApuracaoTotal(java.math.BigDecimal valorApuracaoTotal)
    {
        this._valorApuracaoTotal = valorApuracaoTotal;
    } //-- void setValorApuracaoTotal(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarDependenciaAliquotaZeradaResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.ConsultarDependenciaAliquotaZeradaResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.ConsultarDependenciaAliquotaZeradaResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.ConsultarDependenciaAliquotaZeradaResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.ConsultarDependenciaAliquotaZeradaResponse unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
