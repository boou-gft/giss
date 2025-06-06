/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ListarPercentualTransicaoResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ListarPercentualTransicaoResponse implements java.io.Serializable {


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
     * Field _qtdeOcorr
     */
    private int _qtdeOcorr = 0;

    /**
     * keeps track of state for field: _qtdeOcorr
     */
    private boolean _has_qtdeOcorr;

    /**
     * Field _saidaList
     */
    private java.util.Vector _saidaList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarPercentualTransicaoResponse() 
     {
        super();
        _saidaList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.response.ListarPercentualTransicaoResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addSaida
     * 
     * 
     * 
     * @param vSaida
     */
    public void addSaida(br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.response.Saida vSaida)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_saidaList.size() < 100)) {
            throw new IndexOutOfBoundsException("addSaida has a maximum of 100");
        }
        _saidaList.addElement(vSaida);
    } //-- void addSaida(br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.response.Saida) 

    /**
     * Method addSaida
     * 
     * 
     * 
     * @param index
     * @param vSaida
     */
    public void addSaida(int index, br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.response.Saida vSaida)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_saidaList.size() < 100)) {
            throw new IndexOutOfBoundsException("addSaida has a maximum of 100");
        }
        _saidaList.insertElementAt(vSaida, index);
    } //-- void addSaida(int, br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.response.Saida) 

    /**
     * Method deleteQtdeOcorr
     * 
     */
    public void deleteQtdeOcorr()
    {
        this._has_qtdeOcorr= false;
    } //-- void deleteQtdeOcorr() 

    /**
     * Method enumerateSaida
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateSaida()
    {
        return _saidaList.elements();
    } //-- java.util.Enumeration enumerateSaida() 

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
     * Returns the value of field 'qtdeOcorr'.
     * 
     * @return int
     * @return the value of field 'qtdeOcorr'.
     */
    public int getQtdeOcorr()
    {
        return this._qtdeOcorr;
    } //-- int getQtdeOcorr() 

    /**
     * Method getSaida
     * 
     * 
     * 
     * @param index
     * @return Saida
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.response.Saida getSaida(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _saidaList.size())) {
            throw new IndexOutOfBoundsException("getSaida: Index value '"+index+"' not in range [0.."+(_saidaList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.response.Saida) _saidaList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.response.Saida getSaida(int) 

    /**
     * Method getSaida
     * 
     * 
     * 
     * @return Saida
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.response.Saida[] getSaida()
    {
        int size = _saidaList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.response.Saida[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.response.Saida[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.response.Saida) _saidaList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.response.Saida[] getSaida() 

    /**
     * Method getSaidaCount
     * 
     * 
     * 
     * @return int
     */
    public int getSaidaCount()
    {
        return _saidaList.size();
    } //-- int getSaidaCount() 

    /**
     * Method hasQtdeOcorr
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeOcorr()
    {
        return this._has_qtdeOcorr;
    } //-- boolean hasQtdeOcorr() 

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
     * Method removeAllSaida
     * 
     */
    public void removeAllSaida()
    {
        _saidaList.removeAllElements();
    } //-- void removeAllSaida() 

    /**
     * Method removeSaida
     * 
     * 
     * 
     * @param index
     * @return Saida
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.response.Saida removeSaida(int index)
    {
        java.lang.Object obj = _saidaList.elementAt(index);
        _saidaList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.response.Saida) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.response.Saida removeSaida(int) 

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
     * Sets the value of field 'mensagem'.
     * 
     * @param mensagem the value of field 'mensagem'.
     */
    public void setMensagem(java.lang.String mensagem)
    {
        this._mensagem = mensagem;
    } //-- void setMensagem(java.lang.String) 

    /**
     * Sets the value of field 'qtdeOcorr'.
     * 
     * @param qtdeOcorr the value of field 'qtdeOcorr'.
     */
    public void setQtdeOcorr(int qtdeOcorr)
    {
        this._qtdeOcorr = qtdeOcorr;
        this._has_qtdeOcorr = true;
    } //-- void setQtdeOcorr(int) 

    /**
     * Method setSaida
     * 
     * 
     * 
     * @param index
     * @param vSaida
     */
    public void setSaida(int index, br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.response.Saida vSaida)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _saidaList.size())) {
            throw new IndexOutOfBoundsException("setSaida: Index value '"+index+"' not in range [0.." + (_saidaList.size() - 1) + "]");
        }
        if (!(index < 100)) {
            throw new IndexOutOfBoundsException("setSaida has a maximum of 100");
        }
        _saidaList.setElementAt(vSaida, index);
    } //-- void setSaida(int, br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.response.Saida) 

    /**
     * Method setSaida
     * 
     * 
     * 
     * @param saidaArray
     */
    public void setSaida(br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.response.Saida[] saidaArray)
    {
        //-- copy array
        _saidaList.removeAllElements();
        for (int i = 0; i < saidaArray.length; i++) {
            _saidaList.addElement(saidaArray[i]);
        }
    } //-- void setSaida(br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.response.Saida) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarPercentualTransicaoResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.response.ListarPercentualTransicaoResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.response.ListarPercentualTransicaoResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.response.ListarPercentualTransicaoResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.response.ListarPercentualTransicaoResponse unmarshal(java.io.Reader) 

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
