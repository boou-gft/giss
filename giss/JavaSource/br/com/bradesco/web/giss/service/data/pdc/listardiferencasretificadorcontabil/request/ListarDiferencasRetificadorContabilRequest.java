/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ListarDiferencasRetificadorContabilRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ListarDiferencasRetificadorContabilRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ANOMES
     */
    private int _ANOMES = 0;

    /**
     * keeps track of state for field: _ANOMES
     */
    private boolean _has_ANOMES;

    /**
     * Field _CODEMPRESA
     */
    private int _CODEMPRESA = 0;

    /**
     * keeps track of state for field: _CODEMPRESA
     */
    private boolean _has_CODEMPRESA;

    /**
     * Field _CIDTFDTRANS
     */
    private int _CIDTFDTRANS = 0;

    /**
     * keeps track of state for field: _CIDTFDTRANS
     */
    private boolean _has_CIDTFDTRANS;

    /**
     * Field _NAPURCISSEMPR
     */
    private int _NAPURCISSEMPR = 0;

    /**
     * keeps track of state for field: _NAPURCISSEMPR
     */
    private boolean _has_NAPURCISSEMPR;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarDiferencasRetificadorContabilRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.request.ListarDiferencasRetificadorContabilRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteANOMES
     * 
     */
    public void deleteANOMES()
    {
        this._has_ANOMES= false;
    } //-- void deleteANOMES() 

    /**
     * Method deleteCIDTFDTRANS
     * 
     */
    public void deleteCIDTFDTRANS()
    {
        this._has_CIDTFDTRANS= false;
    } //-- void deleteCIDTFDTRANS() 

    /**
     * Method deleteCODEMPRESA
     * 
     */
    public void deleteCODEMPRESA()
    {
        this._has_CODEMPRESA= false;
    } //-- void deleteCODEMPRESA() 

    /**
     * Method deleteNAPURCISSEMPR
     * 
     */
    public void deleteNAPURCISSEMPR()
    {
        this._has_NAPURCISSEMPR= false;
    } //-- void deleteNAPURCISSEMPR() 

    /**
     * Returns the value of field 'ANOMES'.
     * 
     * @return int
     * @return the value of field 'ANOMES'.
     */
    public int getANOMES()
    {
        return this._ANOMES;
    } //-- int getANOMES() 

    /**
     * Returns the value of field 'CIDTFDTRANS'.
     * 
     * @return int
     * @return the value of field 'CIDTFDTRANS'.
     */
    public int getCIDTFDTRANS()
    {
        return this._CIDTFDTRANS;
    } //-- int getCIDTFDTRANS() 

    /**
     * Returns the value of field 'CODEMPRESA'.
     * 
     * @return int
     * @return the value of field 'CODEMPRESA'.
     */
    public int getCODEMPRESA()
    {
        return this._CODEMPRESA;
    } //-- int getCODEMPRESA() 

    /**
     * Returns the value of field 'NAPURCISSEMPR'.
     * 
     * @return int
     * @return the value of field 'NAPURCISSEMPR'.
     */
    public int getNAPURCISSEMPR()
    {
        return this._NAPURCISSEMPR;
    } //-- int getNAPURCISSEMPR() 

    /**
     * Method hasANOMES
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasANOMES()
    {
        return this._has_ANOMES;
    } //-- boolean hasANOMES() 

    /**
     * Method hasCIDTFDTRANS
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCIDTFDTRANS()
    {
        return this._has_CIDTFDTRANS;
    } //-- boolean hasCIDTFDTRANS() 

    /**
     * Method hasCODEMPRESA
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCODEMPRESA()
    {
        return this._has_CODEMPRESA;
    } //-- boolean hasCODEMPRESA() 

    /**
     * Method hasNAPURCISSEMPR
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNAPURCISSEMPR()
    {
        return this._has_NAPURCISSEMPR;
    } //-- boolean hasNAPURCISSEMPR() 

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
     * Sets the value of field 'ANOMES'.
     * 
     * @param ANOMES the value of field 'ANOMES'.
     */
    public void setANOMES(int ANOMES)
    {
        this._ANOMES = ANOMES;
        this._has_ANOMES = true;
    } //-- void setANOMES(int) 

    /**
     * Sets the value of field 'CIDTFDTRANS'.
     * 
     * @param CIDTFDTRANS the value of field 'CIDTFDTRANS'.
     */
    public void setCIDTFDTRANS(int CIDTFDTRANS)
    {
        this._CIDTFDTRANS = CIDTFDTRANS;
        this._has_CIDTFDTRANS = true;
    } //-- void setCIDTFDTRANS(int) 

    /**
     * Sets the value of field 'CODEMPRESA'.
     * 
     * @param CODEMPRESA the value of field 'CODEMPRESA'.
     */
    public void setCODEMPRESA(int CODEMPRESA)
    {
        this._CODEMPRESA = CODEMPRESA;
        this._has_CODEMPRESA = true;
    } //-- void setCODEMPRESA(int) 

    /**
     * Sets the value of field 'NAPURCISSEMPR'.
     * 
     * @param NAPURCISSEMPR the value of field 'NAPURCISSEMPR'.
     */
    public void setNAPURCISSEMPR(int NAPURCISSEMPR)
    {
        this._NAPURCISSEMPR = NAPURCISSEMPR;
        this._has_NAPURCISSEMPR = true;
    } //-- void setNAPURCISSEMPR(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarDiferencasRetificadorContabilRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.request.ListarDiferencasRetificadorContabilRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.request.ListarDiferencasRetificadorContabilRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.request.ListarDiferencasRetificadorContabilRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.request.ListarDiferencasRetificadorContabilRequest unmarshal(java.io.Reader) 

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
