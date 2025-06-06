/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListaDepApuracaoAposFechISSResponse.java,v 1.4 2018/04/24 02:27:05 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response;

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
 * Class ListaDepApuracaoAposFechISSResponse.
 * 
 * @version $Revision: 1.4 $ $Date: 2018/04/24 02:27:05 $
 */
public class ListaDepApuracaoAposFechISSResponse implements java.io.Serializable {


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
     * Field _qtdeRegistros
     */
    private int _qtdeRegistros = 0;

    /**
     * keeps track of state for field: _qtdeRegistros
     */
    private boolean _has_qtdeRegistros;

    /**
     * Field _dtProcessamento
     */
    private java.lang.String _dtProcessamento;

    /**
     * Field _sinalTotalReceita
     */
    private java.lang.String _sinalTotalReceita;

    /**
     * Field _valorTotalReceita
     */
    private java.math.BigDecimal _valorTotalReceita = new java.math.BigDecimal("0");

    /**
     * Field _sinalTotalIss
     */
    private java.lang.String _sinalTotalIss;

    /**
     * Field _valorTotalIss
     */
    private java.math.BigDecimal _valorTotalIss = new java.math.BigDecimal("0");

    /**
     * Field _sinalTotalReceitaAg
     */
    private java.lang.String _sinalTotalReceitaAg;

    /**
     * Field _valorTotalReceitaAg
     */
    private java.math.BigDecimal _valorTotalReceitaAg = new java.math.BigDecimal("0");

    /**
     * Field _sinalTotalIssAg
     */
    private java.lang.String _sinalTotalIssAg;

    /**
     * Field _valorTotalIssAg
     */
    private java.math.BigDecimal _valorTotalIssAg = new java.math.BigDecimal("0");

    /**
     * Field _sinalTotalReceitaPa
     */
    private java.lang.String _sinalTotalReceitaPa;

    /**
     * Field _valorTotalReceitaPa
     */
    private java.math.BigDecimal _valorTotalReceitaPa = new java.math.BigDecimal("0");

    /**
     * Field _sinalTotalIssPa
     */
    private java.lang.String _sinalTotalIssPa;

    /**
     * Field _valorTotalIssPa
     */
    private java.math.BigDecimal _valorTotalIssPa = new java.math.BigDecimal("0");

    /**
     * Field _ocorrenciasApurParcDepList
     */
    private java.util.Vector _ocorrenciasApurParcDepList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaDepApuracaoAposFechISSResponse() 
     {
        super();
        setValorTotalReceita(new java.math.BigDecimal("0"));
        setValorTotalIss(new java.math.BigDecimal("0"));
        setValorTotalReceitaAg(new java.math.BigDecimal("0"));
        setValorTotalIssAg(new java.math.BigDecimal("0"));
        setValorTotalReceitaPa(new java.math.BigDecimal("0"));
        setValorTotalIssPa(new java.math.BigDecimal("0"));
        _ocorrenciasApurParcDepList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.ListaDepApuracaoAposFechISSResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOcorrenciasApurParcDep
     * 
     * 
     * 
     * @param vOcorrenciasApurParcDep
     */
    public void addOcorrenciasApurParcDep(br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.OcorrenciasApurParcDep vOcorrenciasApurParcDep)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasApurParcDepList.addElement(vOcorrenciasApurParcDep);
    } //-- void addOcorrenciasApurParcDep(br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.OcorrenciasApurParcDep) 

    /**
     * Method addOcorrenciasApurParcDep
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasApurParcDep
     */
    public void addOcorrenciasApurParcDep(int index, br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.OcorrenciasApurParcDep vOcorrenciasApurParcDep)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasApurParcDepList.insertElementAt(vOcorrenciasApurParcDep, index);
    } //-- void addOcorrenciasApurParcDep(int, br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.OcorrenciasApurParcDep) 

    /**
     * Method deleteQtdeRegistros
     * 
     */
    public void deleteQtdeRegistros()
    {
        this._has_qtdeRegistros= false;
    } //-- void deleteQtdeRegistros() 

    /**
     * Method enumerateOcorrenciasApurParcDep
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateOcorrenciasApurParcDep()
    {
        return _ocorrenciasApurParcDepList.elements();
    } //-- java.util.Enumeration enumerateOcorrenciasApurParcDep() 

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
     * Returns the value of field 'dtProcessamento'.
     * 
     * @return String
     * @return the value of field 'dtProcessamento'.
     */
    public java.lang.String getDtProcessamento()
    {
        return this._dtProcessamento;
    } //-- java.lang.String getDtProcessamento() 

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
     * Method getOcorrenciasApurParcDep
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasApurParcDep
     */
    public br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.OcorrenciasApurParcDep getOcorrenciasApurParcDep(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasApurParcDepList.size())) {
            throw new IndexOutOfBoundsException("getOcorrenciasApurParcDep: Index value '"+index+"' not in range [0.."+(_ocorrenciasApurParcDepList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.OcorrenciasApurParcDep) _ocorrenciasApurParcDepList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.OcorrenciasApurParcDep getOcorrenciasApurParcDep(int) 

    /**
     * Method getOcorrenciasApurParcDep
     * 
     * 
     * 
     * @return OcorrenciasApurParcDep
     */
    public br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.OcorrenciasApurParcDep[] getOcorrenciasApurParcDep()
    {
        int size = _ocorrenciasApurParcDepList.size();
        br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.OcorrenciasApurParcDep[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.OcorrenciasApurParcDep[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.OcorrenciasApurParcDep) _ocorrenciasApurParcDepList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.OcorrenciasApurParcDep[] getOcorrenciasApurParcDep() 

    /**
     * Method getOcorrenciasApurParcDepCount
     * 
     * 
     * 
     * @return int
     */
    public int getOcorrenciasApurParcDepCount()
    {
        return _ocorrenciasApurParcDepList.size();
    } //-- int getOcorrenciasApurParcDepCount() 

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
     * Returns the value of field 'sinalTotalIss'.
     * 
     * @return String
     * @return the value of field 'sinalTotalIss'.
     */
    public java.lang.String getSinalTotalIss()
    {
        return this._sinalTotalIss;
    } //-- java.lang.String getSinalTotalIss() 

    /**
     * Returns the value of field 'sinalTotalIssAg'.
     * 
     * @return String
     * @return the value of field 'sinalTotalIssAg'.
     */
    public java.lang.String getSinalTotalIssAg()
    {
        return this._sinalTotalIssAg;
    } //-- java.lang.String getSinalTotalIssAg() 

    /**
     * Returns the value of field 'sinalTotalIssPa'.
     * 
     * @return String
     * @return the value of field 'sinalTotalIssPa'.
     */
    public java.lang.String getSinalTotalIssPa()
    {
        return this._sinalTotalIssPa;
    } //-- java.lang.String getSinalTotalIssPa() 

    /**
     * Returns the value of field 'sinalTotalReceita'.
     * 
     * @return String
     * @return the value of field 'sinalTotalReceita'.
     */
    public java.lang.String getSinalTotalReceita()
    {
        return this._sinalTotalReceita;
    } //-- java.lang.String getSinalTotalReceita() 

    /**
     * Returns the value of field 'sinalTotalReceitaAg'.
     * 
     * @return String
     * @return the value of field 'sinalTotalReceitaAg'.
     */
    public java.lang.String getSinalTotalReceitaAg()
    {
        return this._sinalTotalReceitaAg;
    } //-- java.lang.String getSinalTotalReceitaAg() 

    /**
     * Returns the value of field 'sinalTotalReceitaPa'.
     * 
     * @return String
     * @return the value of field 'sinalTotalReceitaPa'.
     */
    public java.lang.String getSinalTotalReceitaPa()
    {
        return this._sinalTotalReceitaPa;
    } //-- java.lang.String getSinalTotalReceitaPa() 

    /**
     * Returns the value of field 'valorTotalIss'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTotalIss'.
     */
    public java.math.BigDecimal getValorTotalIss()
    {
        return this._valorTotalIss;
    } //-- java.math.BigDecimal getValorTotalIss() 

    /**
     * Returns the value of field 'valorTotalIssAg'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTotalIssAg'.
     */
    public java.math.BigDecimal getValorTotalIssAg()
    {
        return this._valorTotalIssAg;
    } //-- java.math.BigDecimal getValorTotalIssAg() 

    /**
     * Returns the value of field 'valorTotalIssPa'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTotalIssPa'.
     */
    public java.math.BigDecimal getValorTotalIssPa()
    {
        return this._valorTotalIssPa;
    } //-- java.math.BigDecimal getValorTotalIssPa() 

    /**
     * Returns the value of field 'valorTotalReceita'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTotalReceita'.
     */
    public java.math.BigDecimal getValorTotalReceita()
    {
        return this._valorTotalReceita;
    } //-- java.math.BigDecimal getValorTotalReceita() 

    /**
     * Returns the value of field 'valorTotalReceitaAg'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTotalReceitaAg'.
     */
    public java.math.BigDecimal getValorTotalReceitaAg()
    {
        return this._valorTotalReceitaAg;
    } //-- java.math.BigDecimal getValorTotalReceitaAg() 

    /**
     * Returns the value of field 'valorTotalReceitaPa'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTotalReceitaPa'.
     */
    public java.math.BigDecimal getValorTotalReceitaPa()
    {
        return this._valorTotalReceitaPa;
    } //-- java.math.BigDecimal getValorTotalReceitaPa() 

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
     * Method removeAllOcorrenciasApurParcDep
     * 
     */
    public void removeAllOcorrenciasApurParcDep()
    {
        _ocorrenciasApurParcDepList.removeAllElements();
    } //-- void removeAllOcorrenciasApurParcDep() 

    /**
     * Method removeOcorrenciasApurParcDep
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasApurParcDep
     */
    public br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.OcorrenciasApurParcDep removeOcorrenciasApurParcDep(int index)
    {
        java.lang.Object obj = _ocorrenciasApurParcDepList.elementAt(index);
        _ocorrenciasApurParcDepList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.OcorrenciasApurParcDep) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.OcorrenciasApurParcDep removeOcorrenciasApurParcDep(int) 

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
     * Sets the value of field 'dtProcessamento'.
     * 
     * @param dtProcessamento the value of field 'dtProcessamento'.
     */
    public void setDtProcessamento(java.lang.String dtProcessamento)
    {
        this._dtProcessamento = dtProcessamento;
    } //-- void setDtProcessamento(java.lang.String) 

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
     * Method setOcorrenciasApurParcDep
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasApurParcDep
     */
    public void setOcorrenciasApurParcDep(int index, br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.OcorrenciasApurParcDep vOcorrenciasApurParcDep)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasApurParcDepList.size())) {
            throw new IndexOutOfBoundsException("setOcorrenciasApurParcDep: Index value '"+index+"' not in range [0.." + (_ocorrenciasApurParcDepList.size() - 1) + "]");
        }
        _ocorrenciasApurParcDepList.setElementAt(vOcorrenciasApurParcDep, index);
    } //-- void setOcorrenciasApurParcDep(int, br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.OcorrenciasApurParcDep) 

    /**
     * Method setOcorrenciasApurParcDep
     * 
     * 
     * 
     * @param ocorrenciasApurParcDepArray
     */
    public void setOcorrenciasApurParcDep(br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.OcorrenciasApurParcDep[] ocorrenciasApurParcDepArray)
    {
        //-- copy array
        _ocorrenciasApurParcDepList.removeAllElements();
        for (int i = 0; i < ocorrenciasApurParcDepArray.length; i++) {
            _ocorrenciasApurParcDepList.addElement(ocorrenciasApurParcDepArray[i]);
        }
    } //-- void setOcorrenciasApurParcDep(br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.OcorrenciasApurParcDep) 

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
     * Sets the value of field 'sinalTotalIss'.
     * 
     * @param sinalTotalIss the value of field 'sinalTotalIss'.
     */
    public void setSinalTotalIss(java.lang.String sinalTotalIss)
    {
        this._sinalTotalIss = sinalTotalIss;
    } //-- void setSinalTotalIss(java.lang.String) 

    /**
     * Sets the value of field 'sinalTotalIssAg'.
     * 
     * @param sinalTotalIssAg the value of field 'sinalTotalIssAg'.
     */
    public void setSinalTotalIssAg(java.lang.String sinalTotalIssAg)
    {
        this._sinalTotalIssAg = sinalTotalIssAg;
    } //-- void setSinalTotalIssAg(java.lang.String) 

    /**
     * Sets the value of field 'sinalTotalIssPa'.
     * 
     * @param sinalTotalIssPa the value of field 'sinalTotalIssPa'.
     */
    public void setSinalTotalIssPa(java.lang.String sinalTotalIssPa)
    {
        this._sinalTotalIssPa = sinalTotalIssPa;
    } //-- void setSinalTotalIssPa(java.lang.String) 

    /**
     * Sets the value of field 'sinalTotalReceita'.
     * 
     * @param sinalTotalReceita the value of field
     * 'sinalTotalReceita'.
     */
    public void setSinalTotalReceita(java.lang.String sinalTotalReceita)
    {
        this._sinalTotalReceita = sinalTotalReceita;
    } //-- void setSinalTotalReceita(java.lang.String) 

    /**
     * Sets the value of field 'sinalTotalReceitaAg'.
     * 
     * @param sinalTotalReceitaAg the value of field
     * 'sinalTotalReceitaAg'.
     */
    public void setSinalTotalReceitaAg(java.lang.String sinalTotalReceitaAg)
    {
        this._sinalTotalReceitaAg = sinalTotalReceitaAg;
    } //-- void setSinalTotalReceitaAg(java.lang.String) 

    /**
     * Sets the value of field 'sinalTotalReceitaPa'.
     * 
     * @param sinalTotalReceitaPa the value of field
     * 'sinalTotalReceitaPa'.
     */
    public void setSinalTotalReceitaPa(java.lang.String sinalTotalReceitaPa)
    {
        this._sinalTotalReceitaPa = sinalTotalReceitaPa;
    } //-- void setSinalTotalReceitaPa(java.lang.String) 

    /**
     * Sets the value of field 'valorTotalIss'.
     * 
     * @param valorTotalIss the value of field 'valorTotalIss'.
     */
    public void setValorTotalIss(java.math.BigDecimal valorTotalIss)
    {
        this._valorTotalIss = valorTotalIss;
    } //-- void setValorTotalIss(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorTotalIssAg'.
     * 
     * @param valorTotalIssAg the value of field 'valorTotalIssAg'.
     */
    public void setValorTotalIssAg(java.math.BigDecimal valorTotalIssAg)
    {
        this._valorTotalIssAg = valorTotalIssAg;
    } //-- void setValorTotalIssAg(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorTotalIssPa'.
     * 
     * @param valorTotalIssPa the value of field 'valorTotalIssPa'.
     */
    public void setValorTotalIssPa(java.math.BigDecimal valorTotalIssPa)
    {
        this._valorTotalIssPa = valorTotalIssPa;
    } //-- void setValorTotalIssPa(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorTotalReceita'.
     * 
     * @param valorTotalReceita the value of field
     * 'valorTotalReceita'.
     */
    public void setValorTotalReceita(java.math.BigDecimal valorTotalReceita)
    {
        this._valorTotalReceita = valorTotalReceita;
    } //-- void setValorTotalReceita(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorTotalReceitaAg'.
     * 
     * @param valorTotalReceitaAg the value of field
     * 'valorTotalReceitaAg'.
     */
    public void setValorTotalReceitaAg(java.math.BigDecimal valorTotalReceitaAg)
    {
        this._valorTotalReceitaAg = valorTotalReceitaAg;
    } //-- void setValorTotalReceitaAg(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorTotalReceitaPa'.
     * 
     * @param valorTotalReceitaPa the value of field
     * 'valorTotalReceitaPa'.
     */
    public void setValorTotalReceitaPa(java.math.BigDecimal valorTotalReceitaPa)
    {
        this._valorTotalReceitaPa = valorTotalReceitaPa;
    } //-- void setValorTotalReceitaPa(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaDepApuracaoAposFechISSResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.ListaDepApuracaoAposFechISSResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.ListaDepApuracaoAposFechISSResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.ListaDepApuracaoAposFechISSResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.ListaDepApuracaoAposFechISSResponse unmarshal(java.io.Reader) 

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
