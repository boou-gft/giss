/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ResultPesqApurMovNaoTributavelResponse.java,v 1.3 2018/04/24 02:26:55 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.response;

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
 * Class ResultPesqApurMovNaoTributavelResponse.
 * 
 * @version $Revision: 1.3 $ $Date: 2018/04/24 02:26:55 $
 */
public class ResultPesqApurMovNaoTributavelResponse implements java.io.Serializable {


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
     * Field _sinalReceitaTotalMun
     */
    private java.lang.String _sinalReceitaTotalMun;

    /**
     * Field _valorReceitaTotalMun
     */
    private java.math.BigDecimal _valorReceitaTotalMun = new java.math.BigDecimal("0");

    /**
     * Field _sinalApuracaoTotalMun
     */
    private java.lang.String _sinalApuracaoTotalMun;

    /**
     * Field _valorApuracaoTotalMun
     */
    private java.math.BigDecimal _valorApuracaoTotalMun = new java.math.BigDecimal("0");

    /**
     * Field _sinalReceitaTotalGer
     */
    private java.lang.String _sinalReceitaTotalGer;

    /**
     * Field _valorReceitaTotalGer
     */
    private java.math.BigDecimal _valorReceitaTotalGer = new java.math.BigDecimal("0");

    /**
     * Field _sinalApuracaoTotalGer
     */
    private java.lang.String _sinalApuracaoTotalGer;

    /**
     * Field _valorApuracaoTotalGer
     */
    private java.math.BigDecimal _valorApuracaoTotalGer = new java.math.BigDecimal("0");

    /**
     * Field _sinalApuracaoTotalAg
     */
    private java.lang.String _sinalApuracaoTotalAg;

    /**
     * Field _valorApuracaoTotalAg
     */
    private java.math.BigDecimal _valorApuracaoTotalAg = new java.math.BigDecimal("0");

    /**
     * Field _sinalApuracaoTotalPa
     */
    private java.lang.String _sinalApuracaoTotalPa;

    /**
     * Field _valorApuracaoTotalPa
     */
    private java.math.BigDecimal _valorApuracaoTotalPa = new java.math.BigDecimal("0");

    /**
     * Field _codEmpresa
     */
    private long _codEmpresa = 0;

    /**
     * keeps track of state for field: _codEmpresa
     */
    private boolean _has_codEmpresa;

    /**
     * Field _descEmpresa
     */
    private java.lang.String _descEmpresa;

    /**
     * Field _codUF
     */
    private long _codUF = 0;

    /**
     * keeps track of state for field: _codUF
     */
    private boolean _has_codUF;

    /**
     * Field _descUF
     */
    private java.lang.String _descUF;

    /**
     * Field _codMunicipio
     */
    private int _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _descMunicipio
     */
    private java.lang.String _descMunicipio;

    /**
     * Field _codDependencia
     */
    private java.lang.String _codDependencia;

    /**
     * Field _qtdeRegistros
     */
    private int _qtdeRegistros = 0;

    /**
     * keeps track of state for field: _qtdeRegistros
     */
    private boolean _has_qtdeRegistros;

    /**
     * Field _ocorrenciasNaoTributaveisList
     */
    private java.util.Vector _ocorrenciasNaoTributaveisList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ResultPesqApurMovNaoTributavelResponse() 
     {
        super();
        setValorReceitaTotalMun(new java.math.BigDecimal("0"));
        setValorApuracaoTotalMun(new java.math.BigDecimal("0"));
        setValorReceitaTotalGer(new java.math.BigDecimal("0"));
        setValorApuracaoTotalGer(new java.math.BigDecimal("0"));
        setValorApuracaoTotalAg(new java.math.BigDecimal("0"));
        setValorApuracaoTotalPa(new java.math.BigDecimal("0"));
        _ocorrenciasNaoTributaveisList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.response.ResultPesqApurMovNaoTributavelResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOcorrenciasNaoTributaveis
     * 
     * 
     * 
     * @param vOcorrenciasNaoTributaveis
     */
    public void addOcorrenciasNaoTributaveis(br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.response.OcorrenciasNaoTributaveis vOcorrenciasNaoTributaveis)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasNaoTributaveisList.addElement(vOcorrenciasNaoTributaveis);
    } //-- void addOcorrenciasNaoTributaveis(br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.response.OcorrenciasNaoTributaveis) 

    /**
     * Method addOcorrenciasNaoTributaveis
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasNaoTributaveis
     */
    public void addOcorrenciasNaoTributaveis(int index, br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.response.OcorrenciasNaoTributaveis vOcorrenciasNaoTributaveis)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasNaoTributaveisList.insertElementAt(vOcorrenciasNaoTributaveis, index);
    } //-- void addOcorrenciasNaoTributaveis(int, br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.response.OcorrenciasNaoTributaveis) 

    /**
     * Method deleteCodEmpresa
     * 
     */
    public void deleteCodEmpresa()
    {
        this._has_codEmpresa= false;
    } //-- void deleteCodEmpresa() 

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteCodUF
     * 
     */
    public void deleteCodUF()
    {
        this._has_codUF= false;
    } //-- void deleteCodUF() 

    /**
     * Method deleteQtdeRegistros
     * 
     */
    public void deleteQtdeRegistros()
    {
        this._has_qtdeRegistros= false;
    } //-- void deleteQtdeRegistros() 

    /**
     * Method enumerateOcorrenciasNaoTributaveis
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateOcorrenciasNaoTributaveis()
    {
        return _ocorrenciasNaoTributaveisList.elements();
    } //-- java.util.Enumeration enumerateOcorrenciasNaoTributaveis() 

    /**
     * Returns the value of field 'codDependencia'.
     * 
     * @return String
     * @return the value of field 'codDependencia'.
     */
    public java.lang.String getCodDependencia()
    {
        return this._codDependencia;
    } //-- java.lang.String getCodDependencia() 

    /**
     * Returns the value of field 'codEmpresa'.
     * 
     * @return long
     * @return the value of field 'codEmpresa'.
     */
    public long getCodEmpresa()
    {
        return this._codEmpresa;
    } //-- long getCodEmpresa() 

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
     * @return int
     * @return the value of field 'codMunicipio'.
     */
    public int getCodMunicipio()
    {
        return this._codMunicipio;
    } //-- int getCodMunicipio() 

    /**
     * Returns the value of field 'codUF'.
     * 
     * @return long
     * @return the value of field 'codUF'.
     */
    public long getCodUF()
    {
        return this._codUF;
    } //-- long getCodUF() 

    /**
     * Returns the value of field 'descEmpresa'.
     * 
     * @return String
     * @return the value of field 'descEmpresa'.
     */
    public java.lang.String getDescEmpresa()
    {
        return this._descEmpresa;
    } //-- java.lang.String getDescEmpresa() 

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
     * Method getOcorrenciasNaoTributaveis
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasNaoTributaveis
     */
    public br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.response.OcorrenciasNaoTributaveis getOcorrenciasNaoTributaveis(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasNaoTributaveisList.size())) {
            throw new IndexOutOfBoundsException("getOcorrenciasNaoTributaveis: Index value '"+index+"' not in range [0.."+(_ocorrenciasNaoTributaveisList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.response.OcorrenciasNaoTributaveis) _ocorrenciasNaoTributaveisList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.response.OcorrenciasNaoTributaveis getOcorrenciasNaoTributaveis(int) 

    /**
     * Method getOcorrenciasNaoTributaveis
     * 
     * 
     * 
     * @return OcorrenciasNaoTributaveis
     */
    public br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.response.OcorrenciasNaoTributaveis[] getOcorrenciasNaoTributaveis()
    {
        int size = _ocorrenciasNaoTributaveisList.size();
        br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.response.OcorrenciasNaoTributaveis[] mArray = new br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.response.OcorrenciasNaoTributaveis[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.response.OcorrenciasNaoTributaveis) _ocorrenciasNaoTributaveisList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.response.OcorrenciasNaoTributaveis[] getOcorrenciasNaoTributaveis() 

    /**
     * Method getOcorrenciasNaoTributaveisCount
     * 
     * 
     * 
     * @return int
     */
    public int getOcorrenciasNaoTributaveisCount()
    {
        return _ocorrenciasNaoTributaveisList.size();
    } //-- int getOcorrenciasNaoTributaveisCount() 

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
     * Returns the value of field 'sinalApuracaoTotalAg'.
     * 
     * @return String
     * @return the value of field 'sinalApuracaoTotalAg'.
     */
    public java.lang.String getSinalApuracaoTotalAg()
    {
        return this._sinalApuracaoTotalAg;
    } //-- java.lang.String getSinalApuracaoTotalAg() 

    /**
     * Returns the value of field 'sinalApuracaoTotalGer'.
     * 
     * @return String
     * @return the value of field 'sinalApuracaoTotalGer'.
     */
    public java.lang.String getSinalApuracaoTotalGer()
    {
        return this._sinalApuracaoTotalGer;
    } //-- java.lang.String getSinalApuracaoTotalGer() 

    /**
     * Returns the value of field 'sinalApuracaoTotalMun'.
     * 
     * @return String
     * @return the value of field 'sinalApuracaoTotalMun'.
     */
    public java.lang.String getSinalApuracaoTotalMun()
    {
        return this._sinalApuracaoTotalMun;
    } //-- java.lang.String getSinalApuracaoTotalMun() 

    /**
     * Returns the value of field 'sinalApuracaoTotalPa'.
     * 
     * @return String
     * @return the value of field 'sinalApuracaoTotalPa'.
     */
    public java.lang.String getSinalApuracaoTotalPa()
    {
        return this._sinalApuracaoTotalPa;
    } //-- java.lang.String getSinalApuracaoTotalPa() 

    /**
     * Returns the value of field 'sinalReceitaTotalGer'.
     * 
     * @return String
     * @return the value of field 'sinalReceitaTotalGer'.
     */
    public java.lang.String getSinalReceitaTotalGer()
    {
        return this._sinalReceitaTotalGer;
    } //-- java.lang.String getSinalReceitaTotalGer() 

    /**
     * Returns the value of field 'sinalReceitaTotalMun'.
     * 
     * @return String
     * @return the value of field 'sinalReceitaTotalMun'.
     */
    public java.lang.String getSinalReceitaTotalMun()
    {
        return this._sinalReceitaTotalMun;
    } //-- java.lang.String getSinalReceitaTotalMun() 

    /**
     * Returns the value of field 'valorApuracaoTotalAg'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorApuracaoTotalAg'.
     */
    public java.math.BigDecimal getValorApuracaoTotalAg()
    {
        return this._valorApuracaoTotalAg;
    } //-- java.math.BigDecimal getValorApuracaoTotalAg() 

    /**
     * Returns the value of field 'valorApuracaoTotalGer'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorApuracaoTotalGer'.
     */
    public java.math.BigDecimal getValorApuracaoTotalGer()
    {
        return this._valorApuracaoTotalGer;
    } //-- java.math.BigDecimal getValorApuracaoTotalGer() 

    /**
     * Returns the value of field 'valorApuracaoTotalMun'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorApuracaoTotalMun'.
     */
    public java.math.BigDecimal getValorApuracaoTotalMun()
    {
        return this._valorApuracaoTotalMun;
    } //-- java.math.BigDecimal getValorApuracaoTotalMun() 

    /**
     * Returns the value of field 'valorApuracaoTotalPa'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorApuracaoTotalPa'.
     */
    public java.math.BigDecimal getValorApuracaoTotalPa()
    {
        return this._valorApuracaoTotalPa;
    } //-- java.math.BigDecimal getValorApuracaoTotalPa() 

    /**
     * Returns the value of field 'valorReceitaTotalGer'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorReceitaTotalGer'.
     */
    public java.math.BigDecimal getValorReceitaTotalGer()
    {
        return this._valorReceitaTotalGer;
    } //-- java.math.BigDecimal getValorReceitaTotalGer() 

    /**
     * Returns the value of field 'valorReceitaTotalMun'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorReceitaTotalMun'.
     */
    public java.math.BigDecimal getValorReceitaTotalMun()
    {
        return this._valorReceitaTotalMun;
    } //-- java.math.BigDecimal getValorReceitaTotalMun() 

    /**
     * Method hasCodEmpresa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodEmpresa()
    {
        return this._has_codEmpresa;
    } //-- boolean hasCodEmpresa() 

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
     * Method hasCodUF
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodUF()
    {
        return this._has_codUF;
    } //-- boolean hasCodUF() 

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
     * Method removeAllOcorrenciasNaoTributaveis
     * 
     */
    public void removeAllOcorrenciasNaoTributaveis()
    {
        _ocorrenciasNaoTributaveisList.removeAllElements();
    } //-- void removeAllOcorrenciasNaoTributaveis() 

    /**
     * Method removeOcorrenciasNaoTributaveis
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasNaoTributaveis
     */
    public br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.response.OcorrenciasNaoTributaveis removeOcorrenciasNaoTributaveis(int index)
    {
        java.lang.Object obj = _ocorrenciasNaoTributaveisList.elementAt(index);
        _ocorrenciasNaoTributaveisList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.response.OcorrenciasNaoTributaveis) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.response.OcorrenciasNaoTributaveis removeOcorrenciasNaoTributaveis(int) 

    /**
     * Sets the value of field 'codDependencia'.
     * 
     * @param codDependencia the value of field 'codDependencia'.
     */
    public void setCodDependencia(java.lang.String codDependencia)
    {
        this._codDependencia = codDependencia;
    } //-- void setCodDependencia(java.lang.String) 

    /**
     * Sets the value of field 'codEmpresa'.
     * 
     * @param codEmpresa the value of field 'codEmpresa'.
     */
    public void setCodEmpresa(long codEmpresa)
    {
        this._codEmpresa = codEmpresa;
        this._has_codEmpresa = true;
    } //-- void setCodEmpresa(long) 

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
    public void setCodMunicipio(int codMunicipio)
    {
        this._codMunicipio = codMunicipio;
        this._has_codMunicipio = true;
    } //-- void setCodMunicipio(int) 

    /**
     * Sets the value of field 'codUF'.
     * 
     * @param codUF the value of field 'codUF'.
     */
    public void setCodUF(long codUF)
    {
        this._codUF = codUF;
        this._has_codUF = true;
    } //-- void setCodUF(long) 

    /**
     * Sets the value of field 'descEmpresa'.
     * 
     * @param descEmpresa the value of field 'descEmpresa'.
     */
    public void setDescEmpresa(java.lang.String descEmpresa)
    {
        this._descEmpresa = descEmpresa;
    } //-- void setDescEmpresa(java.lang.String) 

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
     * Method setOcorrenciasNaoTributaveis
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasNaoTributaveis
     */
    public void setOcorrenciasNaoTributaveis(int index, br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.response.OcorrenciasNaoTributaveis vOcorrenciasNaoTributaveis)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasNaoTributaveisList.size())) {
            throw new IndexOutOfBoundsException("setOcorrenciasNaoTributaveis: Index value '"+index+"' not in range [0.." + (_ocorrenciasNaoTributaveisList.size() - 1) + "]");
        }
        _ocorrenciasNaoTributaveisList.setElementAt(vOcorrenciasNaoTributaveis, index);
    } //-- void setOcorrenciasNaoTributaveis(int, br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.response.OcorrenciasNaoTributaveis) 

    /**
     * Method setOcorrenciasNaoTributaveis
     * 
     * 
     * 
     * @param ocorrenciasNaoTributaveisArray
     */
    public void setOcorrenciasNaoTributaveis(br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.response.OcorrenciasNaoTributaveis[] ocorrenciasNaoTributaveisArray)
    {
        //-- copy array
        _ocorrenciasNaoTributaveisList.removeAllElements();
        for (int i = 0; i < ocorrenciasNaoTributaveisArray.length; i++) {
            _ocorrenciasNaoTributaveisList.addElement(ocorrenciasNaoTributaveisArray[i]);
        }
    } //-- void setOcorrenciasNaoTributaveis(br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.response.OcorrenciasNaoTributaveis) 

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
     * Sets the value of field 'sinalApuracaoTotalAg'.
     * 
     * @param sinalApuracaoTotalAg the value of field
     * 'sinalApuracaoTotalAg'.
     */
    public void setSinalApuracaoTotalAg(java.lang.String sinalApuracaoTotalAg)
    {
        this._sinalApuracaoTotalAg = sinalApuracaoTotalAg;
    } //-- void setSinalApuracaoTotalAg(java.lang.String) 

    /**
     * Sets the value of field 'sinalApuracaoTotalGer'.
     * 
     * @param sinalApuracaoTotalGer the value of field
     * 'sinalApuracaoTotalGer'.
     */
    public void setSinalApuracaoTotalGer(java.lang.String sinalApuracaoTotalGer)
    {
        this._sinalApuracaoTotalGer = sinalApuracaoTotalGer;
    } //-- void setSinalApuracaoTotalGer(java.lang.String) 

    /**
     * Sets the value of field 'sinalApuracaoTotalMun'.
     * 
     * @param sinalApuracaoTotalMun the value of field
     * 'sinalApuracaoTotalMun'.
     */
    public void setSinalApuracaoTotalMun(java.lang.String sinalApuracaoTotalMun)
    {
        this._sinalApuracaoTotalMun = sinalApuracaoTotalMun;
    } //-- void setSinalApuracaoTotalMun(java.lang.String) 

    /**
     * Sets the value of field 'sinalApuracaoTotalPa'.
     * 
     * @param sinalApuracaoTotalPa the value of field
     * 'sinalApuracaoTotalPa'.
     */
    public void setSinalApuracaoTotalPa(java.lang.String sinalApuracaoTotalPa)
    {
        this._sinalApuracaoTotalPa = sinalApuracaoTotalPa;
    } //-- void setSinalApuracaoTotalPa(java.lang.String) 

    /**
     * Sets the value of field 'sinalReceitaTotalGer'.
     * 
     * @param sinalReceitaTotalGer the value of field
     * 'sinalReceitaTotalGer'.
     */
    public void setSinalReceitaTotalGer(java.lang.String sinalReceitaTotalGer)
    {
        this._sinalReceitaTotalGer = sinalReceitaTotalGer;
    } //-- void setSinalReceitaTotalGer(java.lang.String) 

    /**
     * Sets the value of field 'sinalReceitaTotalMun'.
     * 
     * @param sinalReceitaTotalMun the value of field
     * 'sinalReceitaTotalMun'.
     */
    public void setSinalReceitaTotalMun(java.lang.String sinalReceitaTotalMun)
    {
        this._sinalReceitaTotalMun = sinalReceitaTotalMun;
    } //-- void setSinalReceitaTotalMun(java.lang.String) 

    /**
     * Sets the value of field 'valorApuracaoTotalAg'.
     * 
     * @param valorApuracaoTotalAg the value of field
     * 'valorApuracaoTotalAg'.
     */
    public void setValorApuracaoTotalAg(java.math.BigDecimal valorApuracaoTotalAg)
    {
        this._valorApuracaoTotalAg = valorApuracaoTotalAg;
    } //-- void setValorApuracaoTotalAg(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorApuracaoTotalGer'.
     * 
     * @param valorApuracaoTotalGer the value of field
     * 'valorApuracaoTotalGer'.
     */
    public void setValorApuracaoTotalGer(java.math.BigDecimal valorApuracaoTotalGer)
    {
        this._valorApuracaoTotalGer = valorApuracaoTotalGer;
    } //-- void setValorApuracaoTotalGer(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorApuracaoTotalMun'.
     * 
     * @param valorApuracaoTotalMun the value of field
     * 'valorApuracaoTotalMun'.
     */
    public void setValorApuracaoTotalMun(java.math.BigDecimal valorApuracaoTotalMun)
    {
        this._valorApuracaoTotalMun = valorApuracaoTotalMun;
    } //-- void setValorApuracaoTotalMun(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorApuracaoTotalPa'.
     * 
     * @param valorApuracaoTotalPa the value of field
     * 'valorApuracaoTotalPa'.
     */
    public void setValorApuracaoTotalPa(java.math.BigDecimal valorApuracaoTotalPa)
    {
        this._valorApuracaoTotalPa = valorApuracaoTotalPa;
    } //-- void setValorApuracaoTotalPa(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorReceitaTotalGer'.
     * 
     * @param valorReceitaTotalGer the value of field
     * 'valorReceitaTotalGer'.
     */
    public void setValorReceitaTotalGer(java.math.BigDecimal valorReceitaTotalGer)
    {
        this._valorReceitaTotalGer = valorReceitaTotalGer;
    } //-- void setValorReceitaTotalGer(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorReceitaTotalMun'.
     * 
     * @param valorReceitaTotalMun the value of field
     * 'valorReceitaTotalMun'.
     */
    public void setValorReceitaTotalMun(java.math.BigDecimal valorReceitaTotalMun)
    {
        this._valorReceitaTotalMun = valorReceitaTotalMun;
    } //-- void setValorReceitaTotalMun(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ResultPesqApurMovNaoTributavelResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.response.ResultPesqApurMovNaoTributavelResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.response.ResultPesqApurMovNaoTributavelResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.response.ResultPesqApurMovNaoTributavelResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.response.ResultPesqApurMovNaoTributavelResponse unmarshal(java.io.Reader) 

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
