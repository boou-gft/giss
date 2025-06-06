/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.manutencaologtransarquivo.request;

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
 * Class ManutencaoLogTransArquivoRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ManutencaoLogTransArquivoRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _eTipoDeManutencao
     */
    private java.lang.String _eTipoDeManutencao;

    /**
     * Field _eNctrlRemssDepdc
     */
    private long _eNctrlRemssDepdc = 0;

    /**
     * keeps track of state for field: _eNctrlRemssDepdc
     */
    private boolean _has_eNctrlRemssDepdc;

    /**
     * Field _eCmunBacen
     */
    private long _eCmunBacen = 0;

    /**
     * keeps track of state for field: _eCmunBacen
     */
    private boolean _has_eCmunBacen;

    /**
     * Field _eCpssoaJurid
     */
    private long _eCpssoaJurid = 0;

    /**
     * keeps track of state for field: _eCpssoaJurid
     */
    private boolean _has_eCpssoaJurid;

    /**
     * Field _eNseqUndOrgnz
     */
    private int _eNseqUndOrgnz = 0;

    /**
     * keeps track of state for field: _eNseqUndOrgnz
     */
    private boolean _has_eNseqUndOrgnz;

    /**
     * Field _eCtpoArqPreft
     */
    private int _eCtpoArqPreft = 0;

    /**
     * keeps track of state for field: _eCtpoArqPreft
     */
    private boolean _has_eCtpoArqPreft;

    /**
     * Field _eIarqRemssPreft
     */
    private java.lang.String _eIarqRemssPreft;

    /**
     * Field _eCsitTrnsmPreft
     */
    private int _eCsitTrnsmPreft = 0;

    /**
     * keeps track of state for field: _eCsitTrnsmPreft
     */
    private boolean _has_eCsitTrnsmPreft;

    /**
     * Field _eRmsgemRetorPreft
     */
    private java.lang.String _eRmsgemRetorPreft;


      //----------------/
     //- Constructors -/
    //----------------/

    public ManutencaoLogTransArquivoRequest() 
     {
        super();
    } //-- br.com.bradesco.web.service.data.pdc.manutencaologtransarquivo.request.ManutencaoLogTransArquivoRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteECmunBacen
     * 
     */
    public void deleteECmunBacen()
    {
        this._has_eCmunBacen= false;
    } //-- void deleteECmunBacen() 

    /**
     * Method deleteECpssoaJurid
     * 
     */
    public void deleteECpssoaJurid()
    {
        this._has_eCpssoaJurid= false;
    } //-- void deleteECpssoaJurid() 

    /**
     * Method deleteECsitTrnsmPreft
     * 
     */
    public void deleteECsitTrnsmPreft()
    {
        this._has_eCsitTrnsmPreft= false;
    } //-- void deleteECsitTrnsmPreft() 

    /**
     * Method deleteECtpoArqPreft
     * 
     */
    public void deleteECtpoArqPreft()
    {
        this._has_eCtpoArqPreft= false;
    } //-- void deleteECtpoArqPreft() 

    /**
     * Method deleteENctrlRemssDepdc
     * 
     */
    public void deleteENctrlRemssDepdc()
    {
        this._has_eNctrlRemssDepdc= false;
    } //-- void deleteENctrlRemssDepdc() 

    /**
     * Method deleteENseqUndOrgnz
     * 
     */
    public void deleteENseqUndOrgnz()
    {
        this._has_eNseqUndOrgnz= false;
    } //-- void deleteENseqUndOrgnz() 

    /**
     * Returns the value of field 'eCmunBacen'.
     * 
     * @return long
     * @return the value of field 'eCmunBacen'.
     */
    public long getECmunBacen()
    {
        return this._eCmunBacen;
    } //-- long getECmunBacen() 

    /**
     * Returns the value of field 'eCpssoaJurid'.
     * 
     * @return long
     * @return the value of field 'eCpssoaJurid'.
     */
    public long getECpssoaJurid()
    {
        return this._eCpssoaJurid;
    } //-- long getECpssoaJurid() 

    /**
     * Returns the value of field 'eCsitTrnsmPreft'.
     * 
     * @return int
     * @return the value of field 'eCsitTrnsmPreft'.
     */
    public int getECsitTrnsmPreft()
    {
        return this._eCsitTrnsmPreft;
    } //-- int getECsitTrnsmPreft() 

    /**
     * Returns the value of field 'eCtpoArqPreft'.
     * 
     * @return int
     * @return the value of field 'eCtpoArqPreft'.
     */
    public int getECtpoArqPreft()
    {
        return this._eCtpoArqPreft;
    } //-- int getECtpoArqPreft() 

    /**
     * Returns the value of field 'eIarqRemssPreft'.
     * 
     * @return String
     * @return the value of field 'eIarqRemssPreft'.
     */
    public java.lang.String getEIarqRemssPreft()
    {
        return this._eIarqRemssPreft;
    } //-- java.lang.String getEIarqRemssPreft() 

    /**
     * Returns the value of field 'eNctrlRemssDepdc'.
     * 
     * @return long
     * @return the value of field 'eNctrlRemssDepdc'.
     */
    public long getENctrlRemssDepdc()
    {
        return this._eNctrlRemssDepdc;
    } //-- long getENctrlRemssDepdc() 

    /**
     * Returns the value of field 'eNseqUndOrgnz'.
     * 
     * @return int
     * @return the value of field 'eNseqUndOrgnz'.
     */
    public int getENseqUndOrgnz()
    {
        return this._eNseqUndOrgnz;
    } //-- int getENseqUndOrgnz() 

    /**
     * Returns the value of field 'eRmsgemRetorPreft'.
     * 
     * @return String
     * @return the value of field 'eRmsgemRetorPreft'.
     */
    public java.lang.String getERmsgemRetorPreft()
    {
        return this._eRmsgemRetorPreft;
    } //-- java.lang.String getERmsgemRetorPreft() 

    /**
     * Returns the value of field 'eTipoDeManutencao'.
     * 
     * @return String
     * @return the value of field 'eTipoDeManutencao'.
     */
    public java.lang.String getETipoDeManutencao()
    {
        return this._eTipoDeManutencao;
    } //-- java.lang.String getETipoDeManutencao() 

    /**
     * Method hasECmunBacen
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasECmunBacen()
    {
        return this._has_eCmunBacen;
    } //-- boolean hasECmunBacen() 

    /**
     * Method hasECpssoaJurid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasECpssoaJurid()
    {
        return this._has_eCpssoaJurid;
    } //-- boolean hasECpssoaJurid() 

    /**
     * Method hasECsitTrnsmPreft
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasECsitTrnsmPreft()
    {
        return this._has_eCsitTrnsmPreft;
    } //-- boolean hasECsitTrnsmPreft() 

    /**
     * Method hasECtpoArqPreft
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasECtpoArqPreft()
    {
        return this._has_eCtpoArqPreft;
    } //-- boolean hasECtpoArqPreft() 

    /**
     * Method hasENctrlRemssDepdc
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasENctrlRemssDepdc()
    {
        return this._has_eNctrlRemssDepdc;
    } //-- boolean hasENctrlRemssDepdc() 

    /**
     * Method hasENseqUndOrgnz
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasENseqUndOrgnz()
    {
        return this._has_eNseqUndOrgnz;
    } //-- boolean hasENseqUndOrgnz() 

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
     * Sets the value of field 'eCmunBacen'.
     * 
     * @param eCmunBacen the value of field 'eCmunBacen'.
     */
    public void setECmunBacen(long eCmunBacen)
    {
        this._eCmunBacen = eCmunBacen;
        this._has_eCmunBacen = true;
    } //-- void setECmunBacen(long) 

    /**
     * Sets the value of field 'eCpssoaJurid'.
     * 
     * @param eCpssoaJurid the value of field 'eCpssoaJurid'.
     */
    public void setECpssoaJurid(long eCpssoaJurid)
    {
        this._eCpssoaJurid = eCpssoaJurid;
        this._has_eCpssoaJurid = true;
    } //-- void setECpssoaJurid(long) 

    /**
     * Sets the value of field 'eCsitTrnsmPreft'.
     * 
     * @param eCsitTrnsmPreft the value of field 'eCsitTrnsmPreft'.
     */
    public void setECsitTrnsmPreft(int eCsitTrnsmPreft)
    {
        this._eCsitTrnsmPreft = eCsitTrnsmPreft;
        this._has_eCsitTrnsmPreft = true;
    } //-- void setECsitTrnsmPreft(int) 

    /**
     * Sets the value of field 'eCtpoArqPreft'.
     * 
     * @param eCtpoArqPreft the value of field 'eCtpoArqPreft'.
     */
    public void setECtpoArqPreft(int eCtpoArqPreft)
    {
        this._eCtpoArqPreft = eCtpoArqPreft;
        this._has_eCtpoArqPreft = true;
    } //-- void setECtpoArqPreft(int) 

    /**
     * Sets the value of field 'eIarqRemssPreft'.
     * 
     * @param eIarqRemssPreft the value of field 'eIarqRemssPreft'.
     */
    public void setEIarqRemssPreft(java.lang.String eIarqRemssPreft)
    {
        this._eIarqRemssPreft = eIarqRemssPreft;
    } //-- void setEIarqRemssPreft(java.lang.String) 

    /**
     * Sets the value of field 'eNctrlRemssDepdc'.
     * 
     * @param eNctrlRemssDepdc the value of field 'eNctrlRemssDepdc'
     */
    public void setENctrlRemssDepdc(long eNctrlRemssDepdc)
    {
        this._eNctrlRemssDepdc = eNctrlRemssDepdc;
        this._has_eNctrlRemssDepdc = true;
    } //-- void setENctrlRemssDepdc(long) 

    /**
     * Sets the value of field 'eNseqUndOrgnz'.
     * 
     * @param eNseqUndOrgnz the value of field 'eNseqUndOrgnz'.
     */
    public void setENseqUndOrgnz(int eNseqUndOrgnz)
    {
        this._eNseqUndOrgnz = eNseqUndOrgnz;
        this._has_eNseqUndOrgnz = true;
    } //-- void setENseqUndOrgnz(int) 

    /**
     * Sets the value of field 'eRmsgemRetorPreft'.
     * 
     * @param eRmsgemRetorPreft the value of field
     * 'eRmsgemRetorPreft'.
     */
    public void setERmsgemRetorPreft(java.lang.String eRmsgemRetorPreft)
    {
        this._eRmsgemRetorPreft = eRmsgemRetorPreft;
    } //-- void setERmsgemRetorPreft(java.lang.String) 

    /**
     * Sets the value of field 'eTipoDeManutencao'.
     * 
     * @param eTipoDeManutencao the value of field
     * 'eTipoDeManutencao'.
     */
    public void setETipoDeManutencao(java.lang.String eTipoDeManutencao)
    {
        this._eTipoDeManutencao = eTipoDeManutencao;
    } //-- void setETipoDeManutencao(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ManutencaoLogTransArquivoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.manutencaologtransarquivo.request.ManutencaoLogTransArquivoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.manutencaologtransarquivo.request.ManutencaoLogTransArquivoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.manutencaologtransarquivo.request.ManutencaoLogTransArquivoRequest.class, reader);
    } //-- br.com.bradesco.web.service.data.pdc.manutencaologtransarquivo.request.ManutencaoLogTransArquivoRequest unmarshal(java.io.Reader) 

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
